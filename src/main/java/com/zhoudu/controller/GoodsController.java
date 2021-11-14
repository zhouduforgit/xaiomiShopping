package com.zhoudu.controller;

import com.zhoudu.domain.Goods;
import com.zhoudu.service.GoodsShoppingService;
import com.zhoudu.util.ResponseMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description TODO
 * @Author 周都
 * @Date 2021/10/30 14:28
 */
@Controller
@RequestMapping("goods")
public class GoodsController {
    @Autowired
    private GoodsShoppingService goodsShoppingService;

    /**
    * Description:  根据商品编号查询商品信息和图片信息，简称商品详情
    * @author: 周都
    * @date: 2021/10/30 14:48
    */
    @GetMapping("/detail/{goodsId}")
    @ResponseBody
    public ResponseMsg findGoodsDetailByGoodsId(@PathVariable Integer goodsId) {
        Goods goodsDetail = goodsShoppingService.findGoodsById(goodsId);
        return goodsDetail != null ?
                ResponseMsg.success().addObejct("goodsDetail", goodsDetail) : ResponseMsg.fail();
    }
}
