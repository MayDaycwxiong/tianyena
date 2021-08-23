package com.tianyena.messageservicemanager.token

import com.dingtalk.api.response.OapiGettokenResponse
import com.tianyena.messageservicemanager.config.ApolloConfiguration
import org.junit.runner.RunWith
import org.powermock.core.classloader.annotations.PrepareForTest
import org.powermock.modules.junit4.PowerMockRunner
import org.powermock.modules.junit4.PowerMockRunnerDelegate
import org.spockframework.runtime.Sputnik
import spock.lang.Specification

@RunWith(PowerMockRunner.class)
@PowerMockRunnerDelegate(Sputnik.class)
@PrepareForTest([TokenManager.class])
class TokenManagerTest extends Specification {

    TokenManager manager = new TokenManager()

    ApolloConfiguration apolloConfiguration = Mock()

    void setup() {
        manager.apolloConfiguration = apolloConfiguration
    }

    // {
    //	"accessToken": "267136c53d8836c9bd75f872c4a69768",
    //	"body": "{\"errcode\":0,\"access_token\":\"267136c53d8836c9bd75f872c4a69768\",\"errmsg\":\"ok\",\"expires_in\":7200}",
    //	"errcode": 0,
    //	"errmsg": "ok",
    //	"errorCode": "0",
    //	"expiresIn": 7200,
    //	"msg": "ok",
    //	"params": {
    //		"appkey": "ding3zoaqyaqgttmfjko",
    //		"appsecret": "ya-oNtoOdWEJEuF88eCJymmfAHIihfiE6VrB56QkQ38FxVr0vkp5u_aT7IdW_v9L"
    //	},
    //	"subCode": "",
    //	"subMsg": "",
    //	"success": true
    //}
    def "test getDingDingAccessToken"() {
        given:
        OapiGettokenResponse response = null

        when: "获取token"
        response = manager.getDingDingAccessToken()

        then:
        1 * apolloConfiguration.getAppKey() >> "ding3zoaqyaqgttmfjko"
        1 * apolloConfiguration.getAppsecret() >> "ya-oNtoOdWEJEuF88eCJymmfAHIihfiE6VrB56QkQ38FxVr0vkp5u_aT7IdW_v9L"
        response != null
        response.errcode == 0
        notThrown(Exception)
    }
}
