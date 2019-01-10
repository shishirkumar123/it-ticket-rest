package com.hcl.ticketsystemrest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.ticketsystemrest.entity.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long>{

}
