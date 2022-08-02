package com.partyapp.query.event.dataTransfer;

import com.partyapp.query.location.dataTransfer.LocationDTO;
import com.partyapp.query.user.dataTransfer.BaseUserDTO;
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

    private BaseUserDTO organizer;
    private LocationDTO location;
}
