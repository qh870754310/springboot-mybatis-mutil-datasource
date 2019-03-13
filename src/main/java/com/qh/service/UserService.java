package com.qh.service;

import com.qh.domain.User;

/**
 * 用户业务接口层
 * Created by Administrator on 2017/9/18.
 */
public interface UserService {

    /**
     * 根据用户名获取用户信息，包括从库的地址信息
     *
     * @param userName
     * @return
     */
    User findByName(String userName);
}
