package com.partyapp.query.event.dto;

import lombok.Data;

import java.sql.Date;

@Data
public class EventDTO {
    private String id;
    private String organizer;
    private String name;
    private String description;
    private String locationId;
    private int maxTickets;
    private double ticketPrice;
    private int capacity;
    private Date initDate;
    private Date endDate;
    private boolean isPublic;
    private boolean isMooneyPoolShown;
}
