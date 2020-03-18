package com.example.ERP_IT_Comany.repository;

import com.example.ERP_IT_Comany.entity.Ticket;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TicketRepository extends CrudRepository<Ticket, Long> {
    List<Ticket> findAll();
}
