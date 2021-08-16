package com.tianyena.messageservicebiz.token;


import java.util.concurrent.ExecutionException;

public interface TokenService {
    /**
     * @description
     * <p>
     *     获取accesstoken
     * </p>
     * @author cuiwx 2021/8/16
     * @return  获取成功返回token，否则返回null
     */
    String getToken() throws ExecutionException;
}
