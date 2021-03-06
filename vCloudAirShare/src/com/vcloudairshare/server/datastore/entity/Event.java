package com.vcloudairshare.server.datastore.entity;

import java.util.Date;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Index;
import com.googlecode.objectify.annotation.Unindex;
import com.vcloudairshare.shared.enumeration.Status;
import com.vcloudairshare.shared.util.DateUtil;
import com.vcloudairshare.shared.enumeration.EventType;
@Entity
@Unindex
public class Event extends DatastoreObject {

	@Index
	private Long eventUser = 0l;

	@Index
	private Date eventDate = new Date();

	@Index
	private int status = Status.getDefault().getId();

	@Index
	private int eventType = EventType.getDefault().getId();
	
	@Index
	private Long linkedEvent = 0l;
	
	public Event() {

	}	

	public Long getEventUser() {
		return eventUser;
	}


	public void setEventUser(Long eventUser) {
		this.eventUser = eventUser;
	}


	public Date getEventDate() {
		return eventDate;
	}

	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}
	public void setEventDate(String date) {
		setEventDate(DateUtil.parseDate(date));
	}
	
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public void setStatus(String status) {
		setStatus(Integer.parseInt(status));
	}

	public int getEventType() {
		return eventType;
	}

	public void setEventType(int eventType) {
		this.eventType = eventType;
	}
	public void setEventType(String status) {
		setEventType(Integer.parseInt(status));
	}
	public Long getLinkedEvent() {
		return linkedEvent;
	}

	public void setLinkedEvent(Long linkedEvent) {
		this.linkedEvent = linkedEvent;
	}
	

}
