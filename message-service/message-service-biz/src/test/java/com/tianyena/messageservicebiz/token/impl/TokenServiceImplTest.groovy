package com.tianyena.messageservicebiz.token.impl

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

}
