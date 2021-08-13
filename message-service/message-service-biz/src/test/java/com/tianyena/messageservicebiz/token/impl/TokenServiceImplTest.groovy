package com.tianyena.messageservicebiz.token.impl

import com.dingtalk.api.response.OapiGettokenResponse
import org.junit.runner.RunWith
import org.powermock.core.classloader.annotations.PrepareForTest
import org.powermock.modules.junit4.PowerMockRunner
import org.powermock.modules.junit4.PowerMockRunnerDelegate
import org.spockframework.runtime.Sputnik
import spock.lang.Specification

@RunWith(PowerMockRunner.class)
@PowerMockRunnerDelegate(Sputnik.class)
@PrepareForTest([TokenServiceImpl.class])
class TokenServiceImplTest extends Specification {
    TokenServiceImpl impl = new TokenServiceImpl()

    void setup() {

    }

    def "test getToken"() {
        given:
        OapiGettokenResponse response = null

        when: "获取token"
        response = impl.getToken()

        then:
        response != null
        response.errcode == 0
        notThrown(Exception)
    }
}
