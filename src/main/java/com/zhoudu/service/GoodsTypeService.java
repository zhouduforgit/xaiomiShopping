package com.zhoudu.service;

import com.zhoudu.dao.GoodsTypeMapper;
import com.zhoudu.domain.GoodsType;
import com.zhoudu.domain.GoodsTypeExample;
import org.springframework.aop.target.LazyInitTargetSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description TODO 商品类型 业务处理类
 * @Author 周都
 * @Date 2021/10/27 11:58
 */
@Service
public class GoodsTypeService {
    @Autowired
    private GoodsTypeMapper goodsTypeMapper;
    /* 查询一级商品类型 */
    public List<GoodsType> findTopLevel() {
        GoodsTypeExample goodsTE = new GoodsTypeExample();
        goodsTE.createCriteria().andPidIsNull();
        return goodsTypeMapper.selectByExample(goodsTE);
    }

    /**
    * Description: 根据一级商品查询对应的二级商品
    * @author: 周都
    * @date: 2021/10/27 12:20
    * @param: 一级商品
    * @return: 返回二级商品List集合
    */
    public List<GoodsType> findSecondLevel(GoodsType top) {
        GoodsTypeExample goodsTE = new GoodsTypeExample();
        goodsTE.createCriteria().andPidEqualTo(top.getId());
        return goodsTypeMapper.selectByExample(goodsTE);
    }

    /**
    * Description: 根据商品类型的id查询商品类型对象
    * @author: 周都
    * @date: 2021/10/30 9:58
    * @param: goodsTypeId 是一级类型时：101；102；103；104；105；106；107；108；109；110
     *                    是二级类型时：10001；10002；10003；20001；20002；20003；30001；30002
    * @return:
    */
    public GoodsType findTypeById(Integer goodsTypeId) {
        return goodsTypeMapper.selectByPrimaryKey(goodsTypeId);
    }
}
