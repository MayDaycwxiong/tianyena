package com.tianyena.messageservicebiz.token;

import com.dingtalk.api.response.OapiGettokenResponse;
import com.taobao.api.ApiException;

public interface TokenService {
    OapiGettokenResponse getToken() throws ApiException;
}
