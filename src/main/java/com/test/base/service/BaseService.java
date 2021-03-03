package com.test.base.service;

import com.test.base.model.BaseModel;

import java.util.List;

/**
 * Created by feng on 2017/9/3.
 */
public interface BaseService<Model extends BaseModel> {

    Model detail(Integer id);

    Model save(Model model);

    Model update(Model model);

    List<Model> selectAll();

    int remove(Integer id);



}
