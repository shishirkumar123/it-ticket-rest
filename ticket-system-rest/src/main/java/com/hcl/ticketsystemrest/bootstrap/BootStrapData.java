package com.hcl.ticketsystemrest.bootstrap;

import java.util.Calendar;
import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.hcl.ticketsystemrest.entity.Ticket;
import com.hcl.ticketsystemrest.repositories.TicketRepository;

@Component
public class BootStrapData implements CommandLineRunner{
	private final TicketRepository ticketRepository;

	public BootStrapData(TicketRepository ticketRepository) {
		super();
		this.ticketRepository = ticketRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Saving data");
		
		Calendar jan9 = Calendar.getInstance();
		jan9.setTime(new Date(119, 0, 9));
		
		Calendar jan8 = Calendar.getInstance();
		jan8.setTime(new Date(119, 0, 8));
		
		Calendar jan7 = Calendar.getInstance();
		jan7.setTime(new Date(119, 0, 7));
		
		Calendar jan6 = Calendar.getInstance();
		jan6.setTime(new Date(119, 0, 6));
		
		Calendar jan5 = Calendar.getInstance();
		jan9.setTime(new Date(119, 0, 5));
		
		Calendar jan4 = Calendar.getInstance();
		jan9.setTime(new Date(119, 0, 4));
		
		ticketRepository.save(new Ticket("John", jan9, Calendar.getInstance(), "Not able to login", "Wayne", "PA"));
		ticketRepository.save(new Ticket("Jane", jan9, Calendar.getInstance(), "Password locked", "Wayne", "PA"));
		ticketRepository.save(new Ticket("Marry", jan7, Calendar.getInstance(), "Need admin access", "Wayne", "PA"));
		ticketRepository.save(new Ticket("Marry", jan6, Calendar.getInstance(), "Need remote access", "Wayne", "PA"));
		
		ticketRepository.save(new Ticket("John", jan9, Calendar.getInstance(), "Not able to login", "Phily", "PA"));
		ticketRepository.save(new Ticket("Amit", jan6, Calendar.getInstance(), "Password locked", "Phily", "PA"));
		ticketRepository.save(new Ticket("Amit", jan9, Calendar.getInstance(), "Need admin access", "Phily", "PA"));
		ticketRepository.save(new Ticket("Marry", jan5, Calendar.getInstance(), "Need remote access", "Phily", "PA"));
		
		
		ticketRepository.save(new Ticket("Jane", jan8, Calendar.getInstance(), "Not able to login", "Memphis", "TN"));
		ticketRepository.save(new Ticket("Sumit", jan9, Calendar.getInstance(), "Password locked", "Memphis", "TN"));
		
		
		ticketRepository.save(new Ticket("Sumit", jan9, Calendar.getInstance(), "Need admin access", "Boston", "MA"));
		ticketRepository.save(new Ticket("Sumit", jan7, Calendar.getInstance(), "Need remote access", "Boston", "MA"));
		ticketRepository.save(new Ticket("Jane", jan5, Calendar.getInstance(), "Not able to login", "Boston", "MA"));
		ticketRepository.save(new Ticket("Jane", jan9, Calendar.getInstance(), "Password locked", "Boston", "MA"));
		ticketRepository.save(new Ticket("Marry", jan7, Calendar.getInstance(), "Need admin access", "Boston", "MA"));
		ticketRepository.save(new Ticket("Amit", jan8, Calendar.getInstance(), "Need remote access", "Boston", "MA"));
		System.out.println("Finished");
	}
}
