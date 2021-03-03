package com.test.base.service.implement;




import com.test.base.model.BaseModel;
import com.test.base.repository.BaseMapper;
import com.test.base.service.BaseService;

import java.util.List;

/**
 * Created by feng on 2017/9/3.
 */
public abstract class BaseServiceImpl<Model extends BaseModel> implements BaseService<Model> {


    protected abstract BaseMapper<Model> getRepo();

    @Override
    public Model detail(Integer id) {


        if(id == null){

            return null;
        }
        return this.getRepo().selectByPrimaryKey(id);

    }

    @Override
    public Model save(Model model) {
        this.getRepo().insert(model);
        return model;
    }

    @Override
    public Model update(Model model) {
        this.getRepo().updateByPrimaryKey(model);
        return model;
    }

    @Override
    public List<Model> selectAll() {
        return this.getRepo().selectAll();

    }

    @Override
    public int remove(Integer id) {
        return this.getRepo().deleteByPrimaryKey(id);

    }


}
