package com.tianyena.messageservicebiz.token.impl;

import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.DingTalkClient;
import com.dingtalk.api.request.OapiGettokenRequest;
import com.dingtalk.api.response.OapiGettokenResponse;
import com.taobao.api.ApiException;
import com.tianyena.messageservicebiz.token.TokenService;

public class TokenServiceImpl implements TokenService {

    public OapiGettokenResponse getToken() throws ApiException {
        DingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/gettoken");
        OapiGettokenRequest request = new OapiGettokenRequest();
        request.setAppkey("ding3zoaqyaqgttmfjko");
        request.setAppsecret("ya-oNtoOdWEJEuF88eCJymmfAHIihfiE6VrB56QkQ38FxVr0vkp5u_aT7IdW_v9L");
        request.setHttpMethod("GET");
        OapiGettokenResponse response = client.execute(request);
        System.out.println(response.toString());
        return response;
    }
}
