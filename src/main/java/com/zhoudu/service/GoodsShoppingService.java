package com.zhoudu.service;

import com.zhoudu.dao.GoodsMapper;
import com.zhoudu.domain.Goods;
import com.zhoudu.domain.GoodsExample;
import com.zhoudu.domain.GoodsService;
import com.zhoudu.domain.GoodsType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO 商品的业务处理类
 * @Author 周都
 * @Date 2021/10/27 12:29
 */
@Service
public class GoodsShoppingService {
    @Autowired
    private GoodsMapper goodsMapper;

    @Autowired
    private GoodsTypeService goodsTypeService;

    /**
    * Description: 根据二级商品类型查询该类型的所有商品 （二级）
    * @author: 周都
    * @param: 二级商品类型
    * @return: 返回指定类型的商品
    */
    public List<Goods> selectGoodsBySecondType(GoodsType type) {
        GoodsExample goodsE = new GoodsExample();
        goodsE.createCriteria().andGoodsTypeIdEqualTo(type.getId());
        List<Goods> goodsList = goodsMapper.selectByExampleWithImg(goodsE);
        return goodsList;
    }

    /**
    * Description:  根据名字模糊查询商品
    * @author: 周都
    * @date: 2021/10/28 18:57
    * @param: 商品名字
    */
    public List<Goods> searchGoodsByNameLike(String name) {
        GoodsExample goodsExample = new GoodsExample();
        goodsExample.createCriteria().andNameLike("%"+name+"%");
        List<Goods> goodsList = goodsMapper.selectByExampleWithImg(goodsExample);
        return goodsList;
    }

    /**
    * Description: 根据一级商品类型 查看所有二级商品
    * @author: 周都
    * @param: 一级商品类型
    * @return:
    */
    public List<Goods> findGoodsByTopLevel(GoodsType type) {
        List<GoodsType> goodsSecondTypeList = goodsTypeService.findSecondLevel(type);
        // 设置集合存储所有二级商品
        List<Goods> goodsLists = new ArrayList<>();
        for(GoodsType secondType : goodsSecondTypeList) {
            GoodsExample goodsExample = new GoodsExample();
            goodsExample.createCriteria().andGoodsTypeIdEqualTo(secondType.getId());
            List<Goods>  secondGoods = goodsMapper.selectByExampleWithImg(goodsExample);
            goodsLists.addAll(secondGoods);
        }
        return goodsLists;
    }

    /*
    通过商品的编号查询商品，顺便关联GoodsImg表 ，查询对应的图片
    * */
    public Goods findGoodsById(Integer goodsId) {
        Goods goods = goodsMapper.selectByPrimaryKey(goodsId);
        return goods;
    }
}
