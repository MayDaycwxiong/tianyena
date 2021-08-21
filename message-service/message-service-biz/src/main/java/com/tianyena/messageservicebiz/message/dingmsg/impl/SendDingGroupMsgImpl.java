package com.tianyena.messageservicebiz.message.dingmsg.impl;

import com.alibaba.fastjson.JSON;
import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.DingTalkClient;
import com.dingtalk.api.request.OapiRobotSendRequest;
import com.dingtalk.api.response.OapiRobotSendResponse;
import com.taobao.api.ApiException;
import com.tianyena.messageservicebiz.message.dingmsg.SendDingGroupMsg;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class SendDingGroupMsgImpl implements SendDingGroupMsg {

    @Override
    public void sendDingMsg(String webHooK, String msgType, String keyContent, String content, List<String> mobiles) throws ApiException {
        DingTalkClient client = new DefaultDingTalkClient(webHooK);
        OapiRobotSendRequest request = new OapiRobotSendRequest();
        request.setMsgtype(msgType);
        OapiRobotSendRequest.Text questText = new OapiRobotSendRequest.Text();
        questText.setContent(keyContent +"\n"+ content);
        request.setText(questText);

        OapiRobotSendRequest.At at = new OapiRobotSendRequest.At();
        at.setAtMobiles(mobiles);
        at.setIsAtAll(false);
        request.setAt(at);

        OapiRobotSendResponse response = client.execute(request);
        log.info(JSON.toJSONString(response));
    }

}
