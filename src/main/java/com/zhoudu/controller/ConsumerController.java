package com.zhoudu.controller;

import com.zhoudu.domain.Consumer;
import com.zhoudu.service.ConsumerService;
import com.zhoudu.util.ResponseMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Description TODO
 * @Author 周都
 * @Date 2021/10/25 11:08
 */
@Controller
@RequestMapping("/consumer")
public class ConsumerController {
    @Autowired
    private ConsumerService consumerService;

    @PostMapping(value = "/login/auth", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public ResponseMsg login(@RequestParam String username,
                             @RequestParam String password, HttpSession session) {

        Consumer consumer = new Consumer(username, password);
        consumer= consumerService.selectConsumerByUsernameAndPassword(consumer);
        session.setAttribute("loginUser", consumer);
        return  consumer != null ? ResponseMsg.success() : ResponseMsg.fail();
    }

    @PostMapping("/register")
    @ResponseBody
    public ResponseMsg register(@RequestParam String username, @RequestParam String password) {
        Consumer consumer = new Consumer(username, password);
        String reslut = consumerService.register(consumer);
        if(reslut.equals("注册成功")) {
            return ResponseMsg.success();
        }
        return ResponseMsg.fail().addObejct("msg",reslut);
    }
}
