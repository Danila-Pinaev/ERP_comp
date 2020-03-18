package com.example.ERP_IT_Comany.controller;

import com.example.ERP_IT_Comany.entity.Ticket;
import com.example.ERP_IT_Comany.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/tickets")
@RestController
public class TicketController {
    @Autowired
    private TicketService ticketService;

    @GetMapping("/getAll")
    public List<Ticket> findAll(){
        return ticketService.findAll();
    }

    @PostMapping("/save")
    public Ticket save(@RequestBody Ticket ticket){
        return ticketService.save(ticket);
    }

}
