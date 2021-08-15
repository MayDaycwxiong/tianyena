package com.tianyena.messageservicebiz.message.dingmsg;

import com.taobao.api.ApiException;

import java.util.List;

public interface SendDingGroupMsg {

    /**
     * @description
     * <p>
     * 0. 引入依赖
     *         <!-- https://mvnrepository.com/artifact/com.aliyun/alibaba-dingtalk-service-sdk -->
     *         <dependency>
     *             <groupId>com.aliyun</groupId>
     *             <artifactId>alibaba-dingtalk-service-sdk</artifactId>
     *             <version>1.0.1</version>
     *         </dependency>
     * 1. 添加机器人，然后得到 Webhook(eg：https://oapi.dingtalk.com/robot/send?access_token=c33c5a2d69120980109a5809f8085ddd3b3d4b5b704b72f1fb033cfe455efcf9)
     * 2. content.setContent 中需要携带创建机器人时的关键词(eg:测试使用)，然后后面跟需要发送的内容文本
     * 3. at.setAtMobiles 中指定需要@的人的手机号(可以是多个)
     * <p/>
     * @author cuiwx  2021/8/15
     * @return
     */
    void sendDingMsg(String webHooK, String msgType, String keyContent, String content, List<String> mobiles) throws ApiException;

}
