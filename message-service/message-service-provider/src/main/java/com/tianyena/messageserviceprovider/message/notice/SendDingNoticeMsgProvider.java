package com.tianyena.messageserviceprovider.message.notice;

import com.tianyena.messageserviceapi.message.notice.SendDingNoticeMsgApi;
import com.tianyena.messageservicebiz.message.notice.SendDingNoticeMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description
 * <p>
 *     发送钉钉通知服务提供者
 * </p>
 * @author cuiwx
 * @version 1.0  2021/8/15
 */
@Service
public class SendDingNoticeMsgProvider implements SendDingNoticeMsgApi {

    @Autowired
    private SendDingNoticeMsg sendDingNoticeMsg;

    public void sendDingNotice(){
        try{
            sendDingNoticeMsg.sendDingNotice();
        }catch (Exception e){

        }

    }
}
