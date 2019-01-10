package com.hcl.ticketsystemrest;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.hcl.ticketsystemrest.entity.Ticket;
import com.hcl.ticketsystemrest.services.TicketService;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class TicketSystemRestApplicationTests {

	@Autowired
	private TicketService ticketService;

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void contextLoads() throws Exception {
		
		Calendar jan9 = Calendar.getInstance();
		jan9.setTime(new Date(119, 0, 9));
		
		Calendar jan8 = Calendar.getInstance();
		jan8.setTime(new Date(119, 0, 8));
		Ticket ticket1 = new Ticket("John", jan9, Calendar.getInstance(), "Not able to login", "Wayne", "PA");
		Ticket ticket2 = new Ticket("Jane", jan8, Calendar.getInstance(), "Password locked", "Wayne", "PA");				
		
		when(ticketService.findAllTickets()).thenReturn(Arrays.asList(ticket1, ticket2));
		
		mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/privileges"))
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(jsonPath("$", hasSize(2)))
        .andExpect(jsonPath("$[0].openedBy", is("John")))
        .andExpect(jsonPath("$[0].description", is("Not able to login")))
        .andExpect(jsonPath("$[1].openedBy", is("Jane")))
        .andExpect(jsonPath("$[1].description", is("Password locked")));
		
		verify(ticketService, times(1)).findAllTickets();
        verifyNoMoreInteractions(ticketService);
	}
}