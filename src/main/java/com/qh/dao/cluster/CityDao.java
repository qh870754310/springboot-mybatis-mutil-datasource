package com.qh.dao.cluster;

import com.qh.domain.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 城市 DAO 接口类
 *
 * Created by Administrator on 2017/9/18.
 */
@Mapper
public interface CityDao {

    /**
     * 根据城市名称，查询城市信息
     *
     * @param cityName 城市名
     * @return
     */
    City findByName(@Param("cityName") String cityName);
}
