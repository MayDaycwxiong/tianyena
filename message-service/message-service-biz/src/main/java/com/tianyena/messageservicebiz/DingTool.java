package com.tianyena.messageservicebiz;

import com.alibaba.fastjson.JSON;
import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.DingTalkClient;
import com.dingtalk.api.request.OapiRobotSendRequest;
import com.dingtalk.api.response.OapiRobotSendResponse;
import com.taobao.api.ApiException;

import java.util.Arrays;
import java.util.List;

/**
 * @author cuiwx
 * @version 1.0  2021/8/7
 * @description https://developers.dingtalk.com/document/robots/custom-robot-access
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
 * </p>
 */
public class DingTool {

    public static void main(String[] args) throws ApiException {

        DingTool.sendDingMsg("https://oapi.dingtalk.com/robot/send?access_token=c33c5a2d69120980109a5809f8085ddd3b3d4b5b704b72f1fb033cfe455efcf9"
                , "text", "测试使用", ":测试文本消息。", Arrays.asList("13588453892"));

        System.out.println("测试使用"+"\n"+"测试文本消息");
    }

    private static void sendDingMsg(String webHooK, String msgType, String keyContent, String content, List<String> mobiles) throws ApiException {
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
        System.out.println(JSON.toJSONString(response));
    }

}
