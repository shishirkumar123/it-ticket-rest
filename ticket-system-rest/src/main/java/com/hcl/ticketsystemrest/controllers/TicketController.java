package com.hcl.ticketsystemrest.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.ticketsystemrest.entity.Ticket;
import com.hcl.ticketsystemrest.services.TicketService;

@RestController
@RequestMapping(TicketController.BASE_URL)
public class TicketController {
	public static final String BASE_URL = "/api/v1/tickets";

	private final TicketService ticketService;

	public TicketController(TicketService ticketService) {
		super();													
		this.ticketService = ticketService;
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping
	List<Ticket> getAllPrivileges(){
		return ticketService.findAllTickets();
	}
}

