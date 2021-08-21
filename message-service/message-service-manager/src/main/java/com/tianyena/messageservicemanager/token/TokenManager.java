package com.tianyena.messageservicemanager.token;

import com.alibaba.fastjson.JSON;
import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.DingTalkClient;
import com.dingtalk.api.request.OapiGettokenRequest;
import com.dingtalk.api.response.OapiGettokenResponse;
import com.google.common.cache.*;
import com.tianyena.messageservicecommon.enums.ENInterfaceInfo;
import com.tianyena.messageservicemanager.config.ApolloConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * @description
 * <p>
 *     获取token
 * </p>
 * @author cuiwx
 * @version 1.0  2021/8/22
 */
@Component
@Slf4j
public class TokenManager {

    @Autowired
    private ApolloConfiguration apolloConfiguration;

    private final String ACCESS_TOKEN = "ACCESS_TOKEN";

    /**
     * @description
     * <p>
     *     guava 官方文档： https://ifeve.com/google-guava-cachesexplained/
     * </p>
     * @author cuiwx 2021/8/18
     * @return
     */
    private RemovalListener<String, Optional<OapiGettokenResponse>> removeListener = new RemovalListener<String, Optional<OapiGettokenResponse>>() {
        @Override
        public void onRemoval(RemovalNotification<String, Optional<OapiGettokenResponse>> removal) {
            log.info("guava移除缓存key:{},value:{}", removal.getKey(), removal.getValue());
        }
    };

    private LoadingCache<String, Optional<OapiGettokenResponse>> accessTokenCache = CacheBuilder
            .newBuilder()
            .maximumSize(1)
            .expireAfterWrite(3, TimeUnit.SECONDS)
            .removalListener(removeListener)
            .build(new CacheLoader<String, Optional<OapiGettokenResponse>>() {

                @Override
                public Optional<OapiGettokenResponse> load(String key) throws Exception {
                    log.info("guava加载缓存key:{}", key);
                    return Optional.ofNullable(getDingDingAccessToken());
                }
            });

    private OapiGettokenResponse getDingDingAccessToken() {
        DingTalkClient client = new DefaultDingTalkClient(ENInterfaceInfo.ACCESS_TOKEN_INFO.getUrl());
        OapiGettokenRequest request = new OapiGettokenRequest();
        request.setAppkey(apolloConfiguration.getAppKey());
        request.setAppsecret(apolloConfiguration.getAppsecret());
        request.setHttpMethod("GET");
        OapiGettokenResponse response = null;
        try {
            response = client.execute(request);
            log.info(JSON.toJSONString(response));
            return response;
        } catch (Exception e) {
            log.error("获取token发生异常！！！", e);
            return response;
        }
    }

    public Optional<OapiGettokenResponse> getToken() throws ExecutionException {
        return accessTokenCache.get(this.ACCESS_TOKEN);
    }
}
