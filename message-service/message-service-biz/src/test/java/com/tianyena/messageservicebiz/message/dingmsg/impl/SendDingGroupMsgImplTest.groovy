package com.tianyena.messageservicebiz.message.dingmsg.impl

import org.junit.runner.RunWith
import org.powermock.core.classloader.annotations.PrepareForTest
import org.powermock.modules.junit4.PowerMockRunner
import org.powermock.modules.junit4.PowerMockRunnerDelegate
import org.spockframework.runtime.Sputnik
import spock.lang.Specification

@RunWith(PowerMockRunner.class)
@PowerMockRunnerDelegate(Sputnik.class)
@PrepareForTest([SendDingGroupMsgImpl.class])
class SendDingGroupMsgImplTest extends Specification {
    SendDingGroupMsgImpl impl=new SendDingGroupMsgImpl()
    void setup(){

    }

    def "test SendDingMsg"() {
        given:

        when:
        impl.sendDingMsg("https://oapi.dingtalk.com/robot/send?access_token=c33c5a2d69120980109a5809f8085ddd3b3d4b5b704b72f1fb033cfe455efcf9"
                , "text", "测试使用", ":测试文本消息。", Arrays.asList("13588453892"))
        then:
        notThrown(Exception)
    }
}
