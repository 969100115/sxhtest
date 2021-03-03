package com.test.controller;

import com.test.bean.UserBasic;
import com.test.service.UserBasicService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("userCollection")
@Slf4j
public class UserCollectionController {

    @Resource
    UserBasicService userBasicService;


    /**
     * 获取用户列表
     * @return
     */
    @RequestMapping(value = "users", method = RequestMethod.GET)
    public List<UserBasic> Detail() {
        List<UserBasic> user = userBasicService.selectAll();
        return user;
    }


}
