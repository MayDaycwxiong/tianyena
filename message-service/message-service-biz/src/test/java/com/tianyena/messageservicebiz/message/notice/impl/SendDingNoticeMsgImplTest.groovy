package com.tianyena.messageservicebiz.message.notice.impl

import com.tianyena.messageservicebiz.token.TokenService
import com.tianyena.messageservicemanager.config.ApolloConfiguration
import org.junit.runner.RunWith
import org.powermock.core.classloader.annotations.PrepareForTest
import org.powermock.modules.junit4.PowerMockRunner
import org.powermock.modules.junit4.PowerMockRunnerDelegate
import org.spockframework.runtime.Sputnik
import spock.lang.Specification

@RunWith(PowerMockRunner.class)
@PowerMockRunnerDelegate(Sputnik.class)
@PrepareForTest([SendDingNoticeMsgImpl.class])
class SendDingNoticeMsgImplTest extends Specification {
    SendDingNoticeMsgImpl impl = new SendDingNoticeMsgImpl()

    TokenService tokenService = Mock()
    ApolloConfiguration apolloConfiguration = Mock()

    void setup() {
        impl.tokenService = tokenService
        impl.apolloConfiguration = apolloConfiguration
    }

    def "test sendDingNotice"() {
        given:

        when:
        impl.sendDingNotice()

        then:
        1 * apolloConfiguration.getAgentId() >> 1261543742
        1 * apolloConfiguration.getUserIdList() >> "245610306723743025"
        1 * tokenService.getToken() >> "267136c53d8836c9bd75f872c4a69768"
        notThrown(Exception)
    }
}
