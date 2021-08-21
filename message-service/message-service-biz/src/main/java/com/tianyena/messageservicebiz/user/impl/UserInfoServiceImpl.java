package com.tianyena.messageservicebiz.user.impl;

import com.alibaba.fastjson.JSON;
import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.DingTalkClient;
import com.dingtalk.api.request.OapiV2UserListRequest;
import com.dingtalk.api.response.OapiV2UserListResponse;
import com.taobao.api.ApiException;
import com.tianyena.messageservicebiz.token.TokenService;
import com.tianyena.messageservicebiz.user.UserInfoService;
import com.tianyena.messageservicecommon.enums.ENInterfaceInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author cuiwx
 * @version 1.0  2021/8/9
 * @description * <p>
 * * AppKey：ding3zoaqyaqgttmfjko
 * * AppSecret：ya-oNtoOdWEJEuF88eCJymmfAHIihfiE6VrB56QkQ38FxVr0vkp5u_aT7IdW_v9L
 * * AgentId：1261543742
 * * <p/>
 */
@Service
@Slf4j
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private TokenService tokenService;

    @Override
    public void getUserInfoDetail(Long deptId, Long currentPage, Long pageSize) throws ApiException {
        DingTalkClient client = new DefaultDingTalkClient(ENInterfaceInfo.USER_DETAIL_INFO.getUrl());
        OapiV2UserListRequest request = new OapiV2UserListRequest();
        request.setDeptId(deptId);
        request.setCursor(currentPage * pageSize);

        request.setSize(pageSize);
        request.setOrderField("modify_desc");
        request.setLanguage("zh_CN");
        OapiV2UserListResponse response = client.execute(request, tokenService.getToken());
        log.info(JSON.toJSONString(response));
    }
}
