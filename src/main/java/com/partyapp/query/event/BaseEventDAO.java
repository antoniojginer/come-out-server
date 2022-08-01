package com.partyapp.query.event;

import com.partyapp.query.location.LocationDAO;
import com.partyapp.query.user.BaseUserDAO;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "event")
public class BaseEventDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
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

    @ManyToOne
    @JoinColumn(name = "organizer")
    private BaseUserDAO organizer;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private LocationDAO location;
}
