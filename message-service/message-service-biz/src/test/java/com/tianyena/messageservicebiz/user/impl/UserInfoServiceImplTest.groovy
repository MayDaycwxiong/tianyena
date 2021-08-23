package com.tianyena.messageservicebiz.user.impl

import com.tianyena.messageservicebiz.token.TokenService
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
    UserInfoServiceImpl impl = new UserInfoServiceImpl()

    TokenService tokenService = Mock()

    void setup() {
        impl.tokenService = tokenService
    }

    // {
    //	"body": "{\"errcode\":0,\"errmsg\":\"ok\",\"result\":{\"has_more\":false,\"list\":[{\"active\":true,\"admin\":true,\"avatar\":\"https:\\/\\/static-legacy.dingtalk.com\\/media\\/lADPDhmOwM8pcsrNC9TNC9A_3024_3028.jpg\",\"boss\":false,\"dept_id_list\":[1],\"dept_order\":176312128252884512,\"exclusive_account\":false,\"hide_mobile\":false,\"leader\":false,\"name\":\"邢彤\",\"unionid\":\"cOWdYRxlXPiSHonxVPiiPlpAiEiE\",\"userid\":\"25073502311172226\"},{\"active\":true,\"admin\":true,\"avatar\":\"https:\\/\\/static-legacy.dingtalk.com\\/media\\/lADPDh0cO7Y-gOXM1szW_214_214.jpg\",\"boss\":false,\"dept_id_list\":[1],\"dept_order\":176312128538956512,\"exclusive_account\":false,\"hide_mobile\":false,\"leader\":false,\"name\":\"崔文雄\",\"unionid\":\"zPBejH4YiSPmvEYiiabbiiOwwiEiE\",\"userid\":\"245610306723743025\"},{\"active\":true,\"admin\":false,\"avatar\":\"https:\\/\\/static-legacy.dingtalk.com\\/media\\/lALPGmxeA7kEG1rNAyDNAyA_800_800.png\",\"boss\":false,\"dept_id_list\":[1],\"dept_order\":176319988487983512,\"exclusive_account\":false,\"hide_mobile\":false,\"leader\":false,\"name\":\"小东东\",\"unionid\":\"kVuIxuTwhuaHGVzzBYUc6giEiE\",\"userid\":\"030920312923287759\"},{\"active\":true,\"admin\":false,\"avatar\":\"https:\\/\\/static-legacy.dingtalk.com\\/media\\/lADPGojJ-PU2o5nNA8_NAhw_540_975.jpg\",\"boss\":false,\"dept_id_list\":[1],\"dept_order\":176321776200746512,\"exclusive_account\":false,\"hide_mobile\":false,\"leader\":false,\"name\":\"可爱琼\",\"title\":\"\",\"unionid\":\"ZD3epUst6seSA8fR5Le7zAiEiE\",\"userid\":\"622861592921584986\"},{\"active\":true,\"admin\":true,\"avatar\":\"https:\\/\\/static-legacy.dingtalk.com\\/media\\/lADPGpb_82vROJ7NAbDNAbA_432_432.jpg\",\"boss\":false,\"dept_id_list\":[1],\"dept_order\":176321779230880512,\"exclusive_account\":false,\"hide_mobile\":false,\"leader\":false,\"name\":\"袁学强\",\"title\":\"\",\"unionid\":\"JzUJg8SZVWmqKHTHqSUbuwiEiE\",\"userid\":\"115501370634331861\"},{\"active\":true,\"admin\":true,\"avatar\":\"https:\\/\\/static-legacy.dingtalk.com\\/media\\/lADPDgQ9wHY7DQjNAfbNAfc_503_502.jpg\",\"boss\":false,\"dept_id_list\":[1],\"dept_order\":176321779234430512,\"exclusive_account\":false,\"hide_mobile\":false,\"leader\":false,\"name\":\"刘林\",\"title\":\"\",\"unionid\":\"UtCMxWoKQSHuDNfWz8iiOiiwiEiE\",\"userid\":\"2241582165678015\"},{\"active\":true,\"admin\":true,\"avatar\":\"https:\\/\\/static-legacy.dingtalk.com\\/media\\/lADPDg7mQIPREk3NAlnNAlg_600_601.jpg\",\"boss\":false,\"dept_id_list\":[1],\"dept_order\":176321806864891512,\"exclusive_account\":false,\"hide_mobile\":false,\"leader\":false,\"name\":\"林纯纯\",\"unionid\":\"oKHONaTYGliiHGVzzBYUc6giEiE\",\"userid\":\"manager5861\"}]},\"request_id\":\"2tkwjqctgw5t\"}",
    //	"errcode": 0,
    //	"errmsg": "ok",
    //	"errorCode": "0",
    //	"msg": "ok",
    //	"params": {
    //		"cursor": "0",
    //		"order_field": "modify_desc",
    //		"language": "zh_CN",
    //		"size": "100",
    //		"dept_id": "1"
    //	},
    //	"result": {
    //		"hasMore": false,
    //		"list": [
    //			{
    //				"active": true,
    //				"admin": true,
    //				"avatar": "https://static-legacy.dingtalk.com/media/lADPDhmOwM8pcsrNC9TNC9A_3024_3028.jpg",
    //				"boss": false,
    //				"deptIdList": [
    //					1
    //				],
    //				"deptOrder": 176312128252884512,
    //				"exclusiveAccount": false,
    //				"hideMobile": false,
    //				"leader": false,
    //				"name": "邢彤",
    //				"unionid": "cOWdYRxlXPiSHonxVPiiPlpAiEiE",
    //				"userid": "25073502311172226"
    //			},
    //			{
    //				"active": true,
    //				"admin": true,
    //				"avatar": "https://static-legacy.dingtalk.com/media/lADPDh0cO7Y-gOXM1szW_214_214.jpg",
    //				"boss": false,
    //				"deptIdList": [
    //					1
    //				],
    //				"deptOrder": 176312128538956512,
    //				"exclusiveAccount": false,
    //				"hideMobile": false,
    //				"leader": false,
    //				"name": "崔文雄",
    //				"unionid": "zPBejH4YiSPmvEYiiabbiiOwwiEiE",
    //				"userid": "245610306723743025"
    //			},
    //			{
    //				"active": true,
    //				"admin": false,
    //				"avatar": "https://static-legacy.dingtalk.com/media/lALPGmxeA7kEG1rNAyDNAyA_800_800.png",
    //				"boss": false,
    //				"deptIdList": [
    //					1
    //				],
    //				"deptOrder": 176319988487983512,
    //				"exclusiveAccount": false,
    //				"hideMobile": false,
    //				"leader": false,
    //				"name": "小东东",
    //				"unionid": "kVuIxuTwhuaHGVzzBYUc6giEiE",
    //				"userid": "030920312923287759"
    //			},
    //			{
    //				"active": true,
    //				"admin": false,
    //				"avatar": "https://static-legacy.dingtalk.com/media/lADPGojJ-PU2o5nNA8_NAhw_540_975.jpg",
    //				"boss": false,
    //				"deptIdList": [
    //					1
    //				],
    //				"deptOrder": 176321776200746512,
    //				"exclusiveAccount": false,
    //				"hideMobile": false,
    //				"leader": false,
    //				"name": "可爱琼",
    //				"title": "",
    //				"unionid": "ZD3epUst6seSA8fR5Le7zAiEiE",
    //				"userid": "622861592921584986"
    //			},
    //			{
    //				"active": true,
    //				"admin": true,
    //				"avatar": "https://static-legacy.dingtalk.com/media/lADPGpb_82vROJ7NAbDNAbA_432_432.jpg",
    //				"boss": false,
    //				"deptIdList": [
    //					1
    //				],
    //				"deptOrder": 176321779230880512,
    //				"exclusiveAccount": false,
    //				"hideMobile": false,
    //				"leader": false,
    //				"name": "袁学强",
    //				"title": "",
    //				"unionid": "JzUJg8SZVWmqKHTHqSUbuwiEiE",
    //				"userid": "115501370634331861"
    //			},
    //			{
    //				"active": true,
    //				"admin": true,
    //				"avatar": "https://static-legacy.dingtalk.com/media/lADPDgQ9wHY7DQjNAfbNAfc_503_502.jpg",
    //				"boss": false,
    //				"deptIdList": [
    //					1
    //				],
    //				"deptOrder": 176321779234430512,
    //				"exclusiveAccount": false,
    //				"hideMobile": false,
    //				"leader": false,
    //				"name": "刘林",
    //				"title": "",
    //				"unionid": "UtCMxWoKQSHuDNfWz8iiOiiwiEiE",
    //				"userid": "2241582165678015"
    //			},
    //			{
    //				"active": true,
    //				"admin": true,
    //				"avatar": "https://static-legacy.dingtalk.com/media/lADPDg7mQIPREk3NAlnNAlg_600_601.jpg",
    //				"boss": false,
    //				"deptIdList": [
    //					1
    //				],
    //				"deptOrder": 176321806864891512,
    //				"exclusiveAccount": false,
    //				"hideMobile": false,
    //				"leader": false,
    //				"name": "林纯纯",
    //				"unionid": "oKHONaTYGliiHGVzzBYUc6giEiE",
    //				"userid": "manager5861"
    //			}
    //		]
    //	},
    //	"subCode": "",
    //	"subMsg": "",
    //	"success": true
    //}
    def "test getUserInfoDetail"() {
        given:

        when:
        impl.getUserInfoDetail(1L, 0L, 100L)
        then:
        1 * tokenService.getToken() >> "267136c53d8836c9bd75f872c4a69768"
        notThrown(Exception)
    }
}
