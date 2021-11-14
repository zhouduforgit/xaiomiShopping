package com.zhoudu.controller;

import com.zhoudu.domain.Goods;
import com.zhoudu.domain.GoodsType;
import com.zhoudu.service.GoodsShoppingService;
import com.zhoudu.service.GoodsTypeService;
import com.zhoudu.util.ResponseMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Description TODO 工具类的控制器
 * @Author 周都
 * @Date 2021/10/28 21:37
 */
@Controller
@RequestMapping("/u")
public class UtilController {
    @Autowired
    private GoodsShoppingService goodsShoppingService ;

    @Autowired
    private GoodsTypeService goodsTypeService;

    @GetMapping("/search/{name}")
    @ResponseBody
    public ResponseMsg selectLikeByName(@PathVariable String name) {
        List<Goods> goodsList = goodsShoppingService.searchGoodsByNameLike(name);
        return goodsList.size() > 0 ? ResponseMsg.success().addObejct("goodsMap",goodsList) : ResponseMsg.fail();
    }

    /**
    * Description: 根据商品类型查询商品
    * @author: 周都
    * @date: 2021/10/30 10:14
    * @param: level是商品等级【1 ，2】 一级商品没有pid，二级反之
     *        goodsTypeId是goodsType表的主键
    * @return:
    */
    @GetMapping("/search/{level}/{goodsTypeId}")
    @ResponseBody
    public ResponseMsg selectGoodsByType (@PathVariable Integer level, @PathVariable Integer goodsTypeId) {
        GoodsType goodsType = goodsTypeService.findTypeById(goodsTypeId);
        List<Goods> listGoods = null;
        if (level == 1) {
            listGoods = goodsShoppingService.findGoodsByTopLevel(goodsType);
        } else if (level == 2) {
            listGoods = goodsShoppingService.selectGoodsBySecondType(goodsType);
        }
        return (listGoods != null && listGoods.size() > 0)
                ? ResponseMsg.success().addObejct("listGoods",listGoods) : ResponseMsg.fail();
    }
}
