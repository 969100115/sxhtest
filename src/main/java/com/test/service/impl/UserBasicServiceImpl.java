package com.test.service.impl;

import com.test.base.repository.BaseMapper;
import com.test.base.service.implement.BaseServiceImpl;
import com.test.bean.UserBasic;
import com.test.mapper.UserBasicMapper;
import com.test.service.UserBasicService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserBasicServiceImpl extends BaseServiceImpl<UserBasic> implements UserBasicService {

    @Resource
    UserBasicMapper userBasicMapper;


    @Override
    protected BaseMapper<UserBasic> getRepo() {
        return userBasicMapper;
    }
}
