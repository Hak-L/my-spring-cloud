package com.sgl.user.controller;/**
 * Created by Ni Klaus on 2019/10/21 0021
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 *@ClassName UserController
 *@Description TODO
 *@Author Ni Klaus
 *@Date 2019/10/21 0021 下午 17:14
 *@Version 1.0
 */
@RestController
public class UserController {
    //引入http操作类
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/buy")
    public String buyTicket(String name){
        String  result = restTemplate.getForObject("http://PROVIDER-TICKET/ticket",String.class);
        return name + "购买" + result;
    }
}
