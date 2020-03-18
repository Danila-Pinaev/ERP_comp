package com.example.ERP_IT_Comany.service;

import com.example.ERP_IT_Comany.entity.Ticket;

import java.util.List;

public interface TicketService {
    Ticket save(Ticket ticket);
    List<Ticket> findAll();
}
