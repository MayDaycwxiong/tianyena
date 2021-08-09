package com.tianyena.messageservicebiz.user.impl;

import com.alibaba.fastjson.JSON;
import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.DingTalkClient;
import com.dingtalk.api.request.OapiV2UserListRequest;
import com.dingtalk.api.response.OapiV2UserListResponse;
import com.taobao.api.ApiException;
import com.tianyena.messageservicebiz.token.impl.TokenServiceImpl;
import com.tianyena.messageservicebiz.user.UserInfoService;

/**
 * @description
 *  * <p>
 *  * AppKey：ding3zoaqyaqgttmfjko
 *  * AppSecret：ya-oNtoOdWEJEuF88eCJymmfAHIihfiE6VrB56QkQ38FxVr0vkp5u_aT7IdW_v9L
 *  * AgentId：1261543742
 *  * <p/>
 * @author cuiwx
 * @version 1.0  2021/8/9
 */
public class UserInfoServiceImpl implements UserInfoService {

    public void getUserInfoDetail(Long deptId, Long currentPage, Long pageSize) throws ApiException {
        DingTalkClient client=new DefaultDingTalkClient("https://oapi.dingtalk.com/topapi/v2/user/list");
        OapiV2UserListRequest request=new OapiV2UserListRequest();
        request.setDeptId(deptId);
        request.setCursor(currentPage*pageSize);

        request.setSize(pageSize);
        request.setOrderField("modify_desc");
        request.setLanguage("zh_CN");
        OapiV2UserListResponse response=client.execute(request,new TokenServiceImpl().getToken().getAccessToken());

        System.out.println(JSON.toJSONString(response));
    }

    public static void main(String[] args) throws ApiException {
        new UserInfoServiceImpl().getUserInfoDetail(1L,0L,100L);
    }

}
