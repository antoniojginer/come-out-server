package com.partyapp.query.user;

import com.partyapp.query.location.LocationDAO;

import javax.persistence.*;

@Entity
@Table(name = "app_user")
public class BaseUserDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "email", nullable = false)
    private String email;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private LocationDAO location;
}
