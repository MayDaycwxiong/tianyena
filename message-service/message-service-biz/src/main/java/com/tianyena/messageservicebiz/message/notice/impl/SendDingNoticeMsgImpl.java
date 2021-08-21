package com.tianyena.messageservicebiz.message.notice.impl;

import com.alibaba.fastjson.JSON;
import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.DingTalkClient;
import com.dingtalk.api.request.OapiMessageCorpconversationAsyncsendV2Request;
import com.dingtalk.api.response.OapiMessageCorpconversationAsyncsendV2Response;
import com.taobao.api.ApiException;
import com.tianyena.messageservicebiz.message.notice.SendDingNoticeMsg;
import com.tianyena.messageservicebiz.token.impl.TokenServiceImpl;
import com.tianyena.messageservicecommon.enums.ENInterfaceInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SendDingNoticeMsgImpl implements SendDingNoticeMsg {

    @Override
    public void sendDingNotice() throws ApiException {
        DingTalkClient client = new DefaultDingTalkClient(ENInterfaceInfo.WORK_NOTIFY_INFO.getUrl());
        OapiMessageCorpconversationAsyncsendV2Request request = new OapiMessageCorpconversationAsyncsendV2Request();
        request.setAgentId(1261543742L);
        request.setToAllUser(true);

        OapiMessageCorpconversationAsyncsendV2Request.Msg msg = new OapiMessageCorpconversationAsyncsendV2Request.Msg();
        msg.setMsgtype("text");
        msg.setText(new OapiMessageCorpconversationAsyncsendV2Request.Text());
        msg.getText().setContent("恕瑞玛 你的皇帝回来了");
        request.setMsg(msg);

        OapiMessageCorpconversationAsyncsendV2Response response = client.execute(request, new TokenServiceImpl().getToken());
        log.info(JSON.toJSONString(response));
    }
}
