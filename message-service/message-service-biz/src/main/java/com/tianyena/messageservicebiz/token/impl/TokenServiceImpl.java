package com.tianyena.messageservicebiz.token.impl;

import com.alibaba.fastjson.JSON;
import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.DingTalkClient;
import com.dingtalk.api.request.OapiGettokenRequest;
import com.dingtalk.api.response.OapiGettokenResponse;
import com.google.common.cache.*;
import com.tianyena.messageservicebiz.token.TokenService;
import com.tianyena.messageservicecommon.enums.ENInterfaceInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.concurrent.TimeUnit;

@Service
@Slf4j
public class TokenServiceImpl implements TokenService {

    private final String ACCESS_TOKEN = "ACCESS_TOKEN";


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

    public OapiGettokenResponse getDingDingAccessToken() {
        DingTalkClient client = new DefaultDingTalkClient(ENInterfaceInfo.ACCESS_TOKEN_INFO.getUrl());
        OapiGettokenRequest request = new OapiGettokenRequest();
        request.setAppkey("ding3zoaqyaqgttmfjko");
        request.setAppsecret("ya-oNtoOdWEJEuF88eCJymmfAHIihfiE6VrB56QkQ38FxVr0vkp5u_aT7IdW_v9L");
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

    @Override
    public String getToken() {
        try {
            Optional<OapiGettokenResponse> oapiGetTokenResponse = accessTokenCache.get(this.ACCESS_TOKEN);
            if (oapiGetTokenResponse.isPresent()) {
                return oapiGetTokenResponse.get().getAccessToken();
            }
        } catch (Exception e) {
            log.info("获取guava缓存出现异常！！！", e);
        }
        return null;
    }
}
