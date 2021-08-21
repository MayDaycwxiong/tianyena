package com.tianyena.messageservicemanager.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @description
 * <p>
 *     统一管理 Apollo 配置
 * </p>
 * @author cuiwx
 * @version 1.0  2021/8/22
 */
@Component
@Getter
public class ApolloConfiguration {

    @Value("${dingding.appKey:ding3zoaqyaqgttmfjko}")
    private String appKey;

    @Value("${dingding.appsecret:ya-oNtoOdWEJEuF88eCJymmfAHIihfiE6VrB56QkQ38FxVr0vkp5u_aT7IdW_v9L}")
    private String appsecret;
}
