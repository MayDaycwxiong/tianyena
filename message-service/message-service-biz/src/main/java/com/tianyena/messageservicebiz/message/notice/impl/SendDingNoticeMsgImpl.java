package com.tianyena.messageservicebiz.message.notice.impl;

import com.alibaba.fastjson.JSON;
import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.DingTalkClient;
import com.dingtalk.api.request.OapiMessageCorpconversationAsyncsendV2Request;
import com.dingtalk.api.response.OapiMessageCorpconversationAsyncsendV2Response;
import com.taobao.api.ApiException;
import com.tianyena.messageservicebiz.message.notice.SendDingNoticeMsg;
import com.tianyena.messageservicebiz.token.TokenService;
import com.tianyena.messageservicecommon.enums.ENInterfaceInfo;
import com.tianyena.messageservicemanager.config.ApolloConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SendDingNoticeMsgImpl implements SendDingNoticeMsg {

    @Autowired
    private TokenService tokenService;

    @Autowired
    private ApolloConfiguration apolloConfiguration;

    @Override
    public void sendDingNotice() throws ApiException {
        DingTalkClient client = new DefaultDingTalkClient(ENInterfaceInfo.WORK_NOTIFY_INFO.getUrl());
        OapiMessageCorpconversationAsyncsendV2Request request = new OapiMessageCorpconversationAsyncsendV2Request();
        request.setAgentId(apolloConfiguration.getAgentId());
        request.setUseridList(apolloConfiguration.getUserIdList());
        request.setToAllUser(false);

        OapiMessageCorpconversationAsyncsendV2Request.Msg msg = new OapiMessageCorpconversationAsyncsendV2Request.Msg();
        msg.setMsgtype("text");
        msg.setText(new OapiMessageCorpconversationAsyncsendV2Request.Text());
        msg.getText().setContent("恕瑞玛 你的皇帝回来了");
        request.setMsg(msg);

        OapiMessageCorpconversationAsyncsendV2Response response = client.execute(request, tokenService.getToken());
        log.info(JSON.toJSONString(response));
    }
}
