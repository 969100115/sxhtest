package com.test.base.repository;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author Wenbo
 * @date 2020/6/29 8:37
 * @Email 969****15@qq.com
 * @phone 176****7037
 */
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T> {

}
