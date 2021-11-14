import com.zhoudu.dao.ConsumerMapper;
import com.zhoudu.domain.Consumer;
import com.zhoudu.domain.ConsumerExample;
import com.zhoudu.domain.Goods;
import com.zhoudu.service.GoodsShoppingService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Description TODO 单元测试
 * @Author 周都
 * @Date 2021/10/25 9:43
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class DaoTest {
    @Autowired
    private ConsumerMapper consumerMapper;

    @Test
    public void testConsumerInsert() {
        Consumer consumer = new Consumer("zhoudu","1234156");
        consumerMapper.insertSelective(consumer);
        System.out.println("插入成功");
    }
    @Test
    public void testConsumerSelect() {
        Consumer consumer = consumerMapper.selectByPrimaryKey(1);
        System.out.println(consumer);
    }

    @Test
    public void testConsumerSelectByExample(){
        ConsumerExample consumerExample = new ConsumerExample();
        consumerExample.createCriteria().andUsernameEqualTo("zhoudu")
                .andPasswordEqualTo("1234156");
        List<Consumer> consumerList = consumerMapper.selectByExample(consumerExample);
        consumerList.forEach(consumer -> System.out.println(consumer));
    }

    @Autowired
    private GoodsShoppingService goodsShoppingService ;
    @Test
    public void selectGoodsByLike() {
        List<Goods> goodsList = goodsShoppingService.searchGoodsByNameLike("笔记本");
        goodsList.forEach(goods -> System.out.println(goods));
    }
}
