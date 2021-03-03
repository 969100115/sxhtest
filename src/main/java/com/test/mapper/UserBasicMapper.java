package com.test.mapper;

import com.test.base.repository.BaseMapper;
import com.test.bean.UserBasic;

public interface UserBasicMapper extends BaseMapper<UserBasic> {

    UserBasic selectUserById(Integer id);

}
