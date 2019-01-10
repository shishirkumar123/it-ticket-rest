package com.hcl.ticketsystemrest.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hcl.ticketsystemrest.entity.Ticket;
import com.hcl.ticketsystemrest.repositories.TicketRepository;

@Service
public class TicketServiceImpl implements TicketService{
	private final TicketRepository ticketRepository;
	
	public TicketServiceImpl(TicketRepository ticketRepository) {
		super();
		this.ticketRepository = ticketRepository;
	}

	@Override
	public List<Ticket> findAllTickets() {
		return ticketRepository.findAll();
	}
}
