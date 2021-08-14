package com.tianyena.messageservicebiz.user.impl

import org.junit.runner.RunWith
import org.powermock.core.classloader.annotations.PrepareForTest
import org.powermock.modules.junit4.PowerMockRunner
import org.powermock.modules.junit4.PowerMockRunnerDelegate
import org.spockframework.runtime.Sputnik
import spock.lang.Specification

@RunWith(PowerMockRunner.class)
@PowerMockRunnerDelegate(Sputnik.class)
@PrepareForTest([UserInfoServiceImpl.class])
class UserInfoServiceImplTest extends Specification {
    UserInfoServiceImpl impl=new UserInfoServiceImpl()

    void setup(){
    }

    def "test getUserInfoDetail"() {
        given:

        when:
        impl.getUserInfoDetail(1L,0L,100L)
        then:
        notThrown(Exception)
    }
}
