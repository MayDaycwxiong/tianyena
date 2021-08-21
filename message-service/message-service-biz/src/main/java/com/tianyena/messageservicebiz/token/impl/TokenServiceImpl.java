package com.tianyena.messageservicebiz.token.impl;

import com.dingtalk.api.response.OapiGettokenResponse;
import com.tianyena.messageservicebiz.token.TokenService;
import com.tianyena.messageservicemanager.token.TokenManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class TokenServiceImpl implements TokenService {

    @Autowired
    private TokenManager tokenManager;

    @Override
    public String getToken() {
        try {
            Optional<OapiGettokenResponse> oapiGetTokenResponse = tokenManager.getToken();
            if (oapiGetTokenResponse.isPresent()) {
                return oapiGetTokenResponse.get().getAccessToken();
            }
        } catch (Exception e) {
            log.error("获取guava缓存出现异常！！！", e);
        }
        return null;
    }
}
