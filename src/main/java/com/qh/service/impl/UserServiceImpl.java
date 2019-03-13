package com.qh.service.impl;

import com.qh.dao.cluster.CityDao;
import com.qh.dao.master.UserDao;
import com.qh.domain.City;
import com.qh.domain.User;
import com.qh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户业务实现层
 * Created by Administrator on 2017/9/18.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao; //主数据源
    @Autowired
    private CityDao cityDao; //从数据源

    /**
     * 根据用户名获取用户信息，包括从库的地址信息
     *
     * @param userName
     * @return
     */
    @Override
    public User findByName(String userName) {
        User user = userDao.findByName(userName);
        City city = cityDao.findByName("宝鸡市");
        user.setCity(city);
        return user;
    }
}
