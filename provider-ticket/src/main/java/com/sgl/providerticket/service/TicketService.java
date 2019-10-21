package com.sgl.providerticket.service;/**
 * Created by Ni Klaus on 2019/10/21 0021
 */

import org.springframework.stereotype.Service;

/**
 *@ClassName TicketService
 *@Description TODO
 *@Author Ni Klaus
 *@Date 2019/10/21 0021 下午 16:42
 *@Version 1.0
 */
@Service
public class TicketService {
    public String getTicket(){
        System.out.println("取票端口：8001");
        return "曼巴精神";
    }
}
