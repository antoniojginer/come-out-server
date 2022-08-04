package com.partyapp.commons.entities.event.base;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.partyapp.commons.entities.location.LocationDTO;
import com.partyapp.commons.entities.user.base.BaseUserDTO;
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
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private Date initDate;
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private Date endDate;
    private Boolean isPublic;
    private Boolean isMooneyPoolShown;
    private Integer eventType;
    private Integer organizerType;

    private BaseUserDTO organizer;
    private LocationDTO location;
}
