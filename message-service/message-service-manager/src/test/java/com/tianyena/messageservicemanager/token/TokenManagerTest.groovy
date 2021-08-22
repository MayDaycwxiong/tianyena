package com.tianyena.messageservicemanager.token

import com.dingtalk.api.response.OapiGettokenResponse
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

    TokenManager manager=new TokenManager();
    void setup() {

    }

    def "test getDingDingAccessToken"() {
        given:
        OapiGettokenResponse response = null

        when: "获取token"
        response = manager.getDingDingAccessToken()

        then:
        response != null
        response.errcode == 0
        notThrown(Exception)
    }

    def "test getToken"() {
        given:

        when:
        String token = manager.getToken()
        then:
        token != null
        notThrown(Exception)
    }
}
