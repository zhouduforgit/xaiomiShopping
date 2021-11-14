package com.zhoudu.controller;

import com.zhoudu.domain.Goods;
import com.zhoudu.domain.GoodsShippingAddress;
import com.zhoudu.domain.GoodsType;
import com.zhoudu.service.GoodsShoppingService;
import com.zhoudu.service.GoodsTypeService;
import com.zhoudu.util.ResponseMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description TODO 登录成功进入首页
 *  此类是首页商品展示
 * @Author 周都
 * @Date 2021/10/27 16:15
 */
@Controller
public class IndexController {

    @Autowired
    private GoodsTypeService goodsTypeService;
    @Autowired
    private GoodsShoppingService goodsShoppingService;

    /**
    * Description: 查询首页的所有商品
     * 首先查询每个一级商品类型
     * 再根据一级商品类型查询所属的二级类型
     * 再根据二级类型查询所有商品
    * @author: 周都
    * @date: 2021/10/27 16:18
    * @return: 返回值ResponseMsg包含一级类型集合 和 【二级类型和对应商品集合】
    */
    @GetMapping("/initIndex")
    @ResponseBody
    public ResponseMsg intiIndex() {
        // 创建hashMap 存储二级类型，和对应商品集合
        Map<Integer,List<Goods>> goodsMap = new HashMap<>();
        // 查询一级商品类型
        List<GoodsType> topLevel = goodsTypeService.findTopLevel();
        for(GoodsType topLevelOfGoods : topLevel) {
            // 根据一级商品类型查询二级商品类型
            List<GoodsType> secondLevel = goodsTypeService.findSecondLevel(topLevelOfGoods);
            for(GoodsType secondLevelGoods : secondLevel) {
                // 根据二级商品类型查询对应商品
                List<Goods> goodsList = goodsShoppingService.selectGoodsBySecondType(secondLevelGoods);
                goodsMap.put(secondLevelGoods.getId(), goodsList);
            }
        }
        return ResponseMsg.success().addObejct("topLevel",topLevel).addObejct("goodsMap", goodsMap);
    }
}
