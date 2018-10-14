package com.shangtouhua.dao;

import com.shangtouhua.entity.Goods;

import java.util.List;

/**
 * Created by Administrator on 2018\10\6 0006.
 */
public interface IGoodsDao {
    List<Goods> queryGoodsPage();
}
