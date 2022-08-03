package com.partyapp.query.event.base.service;

import com.partyapp.query.location.service.LocationDTO;
import com.partyapp.query.user.service.BaseUserDTO;
import lombok.Data;

import java.util.Date;

@Data
public class BaseEventDTO {
    private Long id;
    private String name;
    private String description;
    private Integer maxTickets;
    private Double ticketPrice;
    private Integer capacity;
    private Date initDate;
    private Date endDate;
    private Boolean isPublic;
    private Boolean isMooneyPoolShown;
    private Integer eventType;
    private Integer organizerType;

    private BaseUserDTO organizer;
    private LocationDTO location;
}
