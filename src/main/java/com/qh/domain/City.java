package com.qh.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * 城市实体类
 * Created by Administrator on 2017/9/18.
 */
@Getter
@Setter
public class City {
    /**
     * 城市编号
     */
    private Long id;
    /**
     * 省份编号
     */
    private Long provinceId;
    /**
     * 城市名称
     */
    private String cityName;
    /**
     * 描述
     */
    private String description;
}
