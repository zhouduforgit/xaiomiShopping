package com.zhoudu.service;

import com.zhoudu.dao.GoodsCartMapper;
import com.zhoudu.domain.Consumer;
import com.zhoudu.domain.Goods;
import com.zhoudu.domain.GoodsCart;
import com.zhoudu.domain.GoodsCartExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Description TODO
 * @Author 周都
 * @Date 2021/11/1 9:23
 */
@Service
public class ShopCartService {
    @Autowired
    private GoodsCartMapper goodsCartMapper;
    /**
     * Description: 为指定客户的指定商品加入购物车
     * @author: 周都
     * @date: 2021/11/1 9:45
     * @param: consumer  是指定的客户  goods是指定的商品
     * @return:
     */
    public boolean addGoodsToShopCart(Consumer consumer, Goods goods) {
        List<GoodsCart> goodsCartList = checkGoodsCart(consumer, goods);
        if(goodsCartList.size() > 0) {
            // 购买数量加1
            int oldConut = goodsCartList.get(0).getBuyCount();
            goodsCartList.get(0).setBuyCount(oldConut + 1);
            // 跟新金额
            double price = goodsCartList.get(0).getSubtotal()/oldConut * goodsCartList.get(0).getBuyCount();
            goodsCartList.get(0).setSubtotal(price);
        }else {
            GoodsCart goodsCart = new GoodsCart(goods.getId(), 1, new Date(),goods.getPrice(), consumer.getId());
            goodsCartMapper.insertSelective(goodsCart);
        }
        return true;
    }

    /**
    * Description: 从购物车中删除指定商品
    * @author: 周都
    * @date: 2021/11/1 10:17
    * @param:
    * @return:
    */
    public boolean deleteGoodsFromShopCart(Consumer consumer, Goods goods) {
        List<GoodsCart> goodsCartList = checkGoodsCart(consumer, goods);
        if(goodsCartList.size() > 0) {
            // 商品存在购物车里  删除
            goodsCartMapper.deleteByPrimaryKey(goodsCartList.get(0).getId());
            return true;
        }
        System.out.println("商品不存在");
        return false;
    }

    /**
    * Description: 查询指定客户的购车信息
    * @author: 周都
    * @date: 2021/11/1 10:20
    * @param:
    * @return:
    */
    public List<GoodsCart> findAllGoodsFromCart(Consumer consumer) {
        GoodsCartExample goodsCartExample = new GoodsCartExample();
        goodsCartExample.createCriteria().andConsumerIdEqualTo(consumer.getId());
        return goodsCartMapper.selectByExample(goodsCartExample);
    }

    /**
    * Description:  查找指定用户的指定商品是在购物车里面
    * @author: 周都
    * @date: 2021/11/1 10:10
    * @param:
    * @return:
    */
    private List<GoodsCart> checkGoodsCart (Consumer consumer, Goods goods) {
        GoodsCartExample goodsCartExample = new GoodsCartExample();
        goodsCartExample.createCriteria().andConsumerIdEqualTo(consumer.getId())
                .andGoodsIdEqualTo(goods.getId());
        List<GoodsCart> goodsCartList = goodsCartMapper.selectByExample(goodsCartExample);
        return goodsCartList;
    }
}
