package com.tianyena.messageservicebiz.user;

import com.taobao.api.ApiException;

/**
 * @description 获取用户信息
 * @author cuiwx
 * @version 1.0  2021/8/9
 */
public interface UserInfoService {
    /**
     * @description  分页获取用户详情况
     * @author cuiwx
     * @version 1.0  2021/8/9
     */
    void getUserInfoDetail(Long deptId, Long currentPage, Long pageSize) throws ApiException;
}
