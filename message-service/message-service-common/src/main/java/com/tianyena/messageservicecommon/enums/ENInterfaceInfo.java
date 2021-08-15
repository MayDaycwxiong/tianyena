package com.tianyena.messageservicecommon.enums;

import lombok.Getter;
/**
 * @description
 * <p>
 *     程序里面使用到的钉钉接口信息列表
 * </p>
 * @author cuiwx
 * @version 1.0  2021/8/15
 */
@Getter
public enum ENInterfaceInfo {

    // interface
    ACCESS_TOKEN_INFO("https://oapi.dingtalk.com/gettoken", "获取凭证-获取企业内部应用的access_token", "https://developers.dingtalk.com/document/app/obtain-orgapp-token"),
    USER_DETAIL_INFO("https://oapi.dingtalk.com/topapi/v2/user/list", "通讯录管理-用户管理2.0-获取部门用户详情", "https://developers.dingtalk.com/document/app/queries-the-complete-information-of-a-department-user"),
    WORK_NOTIFY_INFO("https://oapi.dingtalk.com/topapi/message/corpconversation/asyncsend_v2", "消息通知-工作通知-发送工作通知", "https://developers.dingtalk.com/document/app/asynchronous-sending-of-enterprise-session-messages"),

    // record
    DING_GROUP_INFO(null, "群机器人-自定义机器人接入-自定义机器人接入", "https://developers.dingtalk.com/document/robots/custom-robot-access"),
    ;
    private String url;
    private String desc;
    private String interfacePath;

    ENInterfaceInfo(String url, String desc, String interfacePath) {
        this.url = url;
        this.desc = desc;
        this.interfacePath = interfacePath;
    }
}
