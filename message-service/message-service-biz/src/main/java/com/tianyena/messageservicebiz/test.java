package com.tianyena.messageservicebiz;

import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.DingTalkClient;
import com.dingtalk.api.request.OapiGettokenRequest;
import com.dingtalk.api.request.OapiMessageCorpconversationAsyncsendV2Request;
import com.dingtalk.api.response.OapiGettokenResponse;
import com.dingtalk.api.response.OapiMessageCorpconversationAsyncsendV2Response;
import com.taobao.api.ApiException;
import com.tianyena.messageservicebiz.token.impl.TokenServiceImpl;


/**
 * @author cuiwx
 * @version 1.0 2021/8/9
 * @description
 */
public class test {

    public static void main(String[] args) throws ApiException {
        DingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/topapi/message/corpconversation/asyncsend_v2");
        OapiMessageCorpconversationAsyncsendV2Request request = new OapiMessageCorpconversationAsyncsendV2Request();
        request.setAgentId(1261543742L);
        request.setToAllUser(true);

        OapiMessageCorpconversationAsyncsendV2Request.Msg msg = new OapiMessageCorpconversationAsyncsendV2Request.Msg();
        msg.setMsgtype("text");
        msg.setText(new OapiMessageCorpconversationAsyncsendV2Request.Text());
        msg.getText().setContent("恕瑞玛 你的皇帝回来了");
        request.setMsg(msg);

        OapiMessageCorpconversationAsyncsendV2Response response = client.execute(request, new TokenServiceImpl().getToken().getAccessToken());
        System.out.println(response.toString());


    }
}
