package com.hcl.ticketsystemrest.entity;


import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Ticket {
	
	@Id
	@GeneratedValue
	private Long ticketId;
	private String openedBy;
	private Calendar opendOn;
	private Calendar lastUpdatedOn;
	private String description;
	private String city;
	private String state;
	

	public Ticket() {//JPA requirement
		super();
	}

	public Ticket(String openedBy, Calendar opendOn, Calendar lastUpdatedOn, String description, String city, String state) {
		super();
		this.openedBy = openedBy;
		this.opendOn = opendOn;
		this.lastUpdatedOn = lastUpdatedOn;
		this.description = description;
		this.city = city;
		this.state = state;
	}

	public Long getTicketId() {
		return ticketId;
	}

	public String getOpenedBy() {
		return openedBy;
	}

	public void setOpenedBy(String openedBy) {
		this.openedBy = openedBy;
	}

	public Calendar getOpendOn() {
		return opendOn;
	}

	public Calendar getLastUpdatedOn() {
		return lastUpdatedOn;
	}

	public void setLastUpdatedOn(Calendar lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}

	public void setOpendOn(Calendar opendOn) {
		this.opendOn = opendOn;
	}

	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}
