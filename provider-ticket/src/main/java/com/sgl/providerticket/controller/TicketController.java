package com.sgl.providerticket.controller;
/**
 * Created by Ni Klaus on 2019/10/21 0021
 */

import com.sgl.providerticket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@ClassName TicketController
 *@Description TODO
 *@Author Ni Klaus
 *@Date 2019/10/21 0021 下午 16:42
 *@Version 1.0
 */
@RestController
public class TicketController {
    @Autowired
    TicketService ticketService;

    @RequestMapping(value = "/ticket")
    public String getTicket(){
        return ticketService.getTicket();
    }
}
