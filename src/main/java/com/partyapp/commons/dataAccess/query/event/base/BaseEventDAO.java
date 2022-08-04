package com.partyapp.commons.dataAccess.query.event.base;

import com.partyapp.commons.dataAccess.query.location.LocationDAO;
import com.partyapp.commons.dataAccess.query.user.base.BaseUserDAO;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "event")
@Data
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
    @Column(name = "organizer_type")
    private Integer organizerType;

    @ManyToOne
    @JoinColumn(name = "organizer")
    private BaseUserDAO organizer;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private LocationDAO location;
}
