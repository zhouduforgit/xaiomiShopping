package com.zhoudu.controller;

import com.zhoudu.dao.GoodsCartMapper;
import com.zhoudu.domain.Consumer;
import com.zhoudu.domain.Goods;
import com.zhoudu.domain.GoodsCart;
import com.zhoudu.domain.GoodsCartExample;
import com.zhoudu.service.GoodsShoppingService;
import com.zhoudu.service.ShopCartService;
import com.zhoudu.util.ResponseMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * @Description TODO  购物车的业务方法
 * @Author 周都
 * @Date 2021/11/1 9:23
 */
@Controller
@RequestMapping("/shopcart")
public class ShopCartCpntroller {
    @Autowired
    private ShopCartService shopCartService;
    @Autowired
    private GoodsShoppingService goodsShoppingService;
    /**
    * Description:  把对应的客户的商品加入到购物车中
    * @author: 周都
    * @date: 2021/11/2 22:25
    * @param:
    * @return:
    */
    @GetMapping("/add/{goodsId}")
    @ResponseBody
    public ResponseMsg addGoodsToCart(@PathVariable Integer goodsId, HttpSession session) {
        Consumer consumer = (Consumer) session.getAttribute("loginUser");
        if(consumer == null) {
            return ResponseMsg.fail();
        }
        Goods goods = goodsShoppingService.findGoodsById(goodsId);
        shopCartService.addGoodsToShopCart(consumer, goods);
        return ResponseMsg.success();
    }

    @GetMapping("/remove/{goodsId}")
    @ResponseBody
    public ResponseMsg removeGoodsFromCart(@PathVariable Integer goodsId,  HttpSession session) {
        Consumer consumer = (Consumer) session.getAttribute("loginUser");
        if(consumer == null) {
            return ResponseMsg.fail();
        }
        Goods goods = goodsShoppingService.findGoodsById(goodsId);
        shopCartService.deleteGoodsFromShopCart(consumer, goods);
        return ResponseMsg.success();
    }

    @GetMapping("/check")
    @ResponseBody
    public ResponseMsg findAllWithConsumer(HttpSession session) {
        Consumer consumer = (Consumer) session.getAttribute("loginUser");
        if (consumer == null) {
            return ResponseMsg.fail();
        }
        List<GoodsCart> cartList = shopCartService.findAllGoodsFromCart(consumer);
        return ResponseMsg.success().addObejct("cartList", cartList);
    }
}
