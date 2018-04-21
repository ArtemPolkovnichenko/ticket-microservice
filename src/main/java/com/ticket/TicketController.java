package com.ticket;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {

    @RequestMapping("/tickets")
    public String getTickets() {
        return "Tickets";
    }
}
