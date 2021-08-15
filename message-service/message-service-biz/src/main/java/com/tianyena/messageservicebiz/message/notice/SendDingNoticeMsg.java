package com.tianyena.messageservicebiz.message.notice;

import com.taobao.api.ApiException;

public interface SendDingNoticeMsg {
    /**
     * @return
     * @description <p>
     * 发送钉钉工作通知
     * </p>
     * @author cuiwx  2021/8/15
     */
    void sendDingNotice() throws ApiException;
}
