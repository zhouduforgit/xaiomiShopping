package com.zhoudu.service;

import com.zhoudu.dao.ConsumerMapper;
import com.zhoudu.domain.Consumer;
import com.zhoudu.domain.ConsumerExample;
import org.springframework.aop.target.LazyInitTargetSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description TODO 这是业务代码
 * @Author 周都
 * @Date 2021/10/25 10:58
 */
@Service
public class ConsumerService {
    @Autowired
    private ConsumerMapper consumerMapper;

    /**
    * Description:
    *  通过账号和密码查询客户是否存在
    * */
    public Consumer selectConsumerByUsernameAndPassword(Consumer consumer){
        ConsumerExample consumerExample = new ConsumerExample();
        consumerExample.createCriteria().andUsernameEqualTo(consumer.getUsername())
                .andPasswordEqualTo(consumer.getPassword());
        List<Consumer> consumerList = consumerMapper.selectByExample(consumerExample);
        return (consumerList !=null && consumerList.size() == 1) ? consumerList.get(0) : null;
    }

    /*
    *  注册方法 ，这是查询客户的账号是否存在，
    *  若不存在就创建，insert
    * */
    public String register(Consumer consumer) {
        ConsumerExample consumerExample = new ConsumerExample();
        consumerExample.createCriteria().andUsernameEqualTo(consumer.getUsername());
        List<Consumer> consumerList = consumerMapper.selectByExample(consumerExample);
        if(consumerList != null && consumerList.size() > 0) {
            return "账号已经注册过了";
        }
        consumerMapper.insertSelective(consumer);
        return "注册成功";
    }
}
