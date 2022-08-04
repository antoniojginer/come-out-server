package com.partyapp.commons.dataAccess.command.event.base;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "event")
@Data
public class BaseEventCommandDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "event_generator")
    @SequenceGenerator(name = "event_generator", sequenceName = "Event_id_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "max_ticket")
    private Integer maxTickets;
    @Column(name = "ticket_price")
    private Double ticketPrice;
    @Column(name = "capacity")
    private Integer capacity;
    @Column(name = "init_date")
    private String initDate;
    @Column(name = "end_date")
    private String endDate;
    @Column(name = "is_public")
    private Boolean isPublic;
    @Column(name = "is_mooney_pool_shown")
    private Boolean isMooneyPoolShown;
    @Column(name = "event_type")
    private Integer eventType;
    @Column(name = "organizer_type")
    private Integer organizerType;
    @Column(name = "organizer")
    private Long organizer;
    @Column(name = "location_id")
    private Long location;
}
