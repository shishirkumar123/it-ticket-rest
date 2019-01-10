package com.hcl.ticketsystemrest.services;

import java.util.List;

import com.hcl.ticketsystemrest.entity.Ticket;


public interface TicketService {
	List<Ticket> findAllTickets();
}
