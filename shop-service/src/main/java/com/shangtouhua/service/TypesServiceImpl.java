package com.shangtouhua.service;

import com.shangtouhua.dao.ITypesDao;
import com.shangtouhua.entity.Types;
import com.shangtouhua.service.api.ITypesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018\9\26 0026.
 */
@Service
public class TypesServiceImpl implements ITypesService {

    @Autowired
    private ITypesDao typesDao;
    @Override
    public List<Types> queryAll() {
        System.out.println("调用服务查询所有分类");
        List<Types> typesList = typesDao.queryAll();
        return typesList;
    }
}
