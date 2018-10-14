package com.shangtouhua.service;

import com.shangtouhua.dao.IGoodsDao;
import com.shangtouhua.entity.Goods;
import com.shangtouhua.service.api.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018\10\6 0006.
 */
@Service
public class GoodsService implements IGoodsService {

    @Autowired
    private IGoodsDao goodsDao;
    @Override
    public List<Goods> queryGoodsPage() {
        List<Goods> goods = goodsDao.queryGoodsPage();
        return goods;
    }
}
