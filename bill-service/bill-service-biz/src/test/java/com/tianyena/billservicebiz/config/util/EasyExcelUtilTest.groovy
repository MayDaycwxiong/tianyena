package com.tianyena.billservicebiz.config.util

import com.tianyena.billserviceapi.dto.easyexcel.WeChatBillDTO
import org.junit.runner.RunWith
import org.powermock.core.classloader.annotations.PrepareForTest
import org.powermock.modules.junit4.PowerMockRunner
import org.powermock.modules.junit4.PowerMockRunnerDelegate
import org.spockframework.runtime.Sputnik
import spock.lang.Specification

@RunWith(PowerMockRunner.class)
@PowerMockRunnerDelegate(Sputnik.class)
@PrepareForTest(EasyExcelUtil.class)
class EasyExcelUtilTest extends Specification {

    def "test deal"() {
        given:
        String fileName = "D:\\Downloads\\Google\\账单\\微信支付账单(20210304-20210604)\\微信支付账单(20210304-20210604).xlsx"

        when:
        def excel = EasyExcelUtil.readExcel(new WeChatBillDTO(),fileName)
        then:
        excel.detailList.size()>0
        notThrown(Exception)
    }
}
