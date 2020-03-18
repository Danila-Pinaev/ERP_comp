package com.example.ERP_IT_Comany.service.serviceIMPL;

import com.example.ERP_IT_Comany.entity.Ticket;
import com.example.ERP_IT_Comany.repository.TicketRepository;
import com.example.ERP_IT_Comany.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {
    @Autowired
    private TicketRepository ticketRepository;
    @Override
    public Ticket save(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    @Override
    public List<Ticket> findAll() {
        return ticketRepository.findAll();
    }
}
