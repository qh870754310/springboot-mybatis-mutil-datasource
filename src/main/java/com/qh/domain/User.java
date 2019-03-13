package com.qh.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * 用户实体类
 * Created by Administrator on 2017/9/18.
 */
@Getter
@Setter
public class User {
    /**
     *  城市编号
     */
    private Long id;
    /**
     * 城市名称
     */
    private String userName;
    /**
     * 描述
     */
    private String description;
    /**
     * 城市
     */
    private City city;
}
