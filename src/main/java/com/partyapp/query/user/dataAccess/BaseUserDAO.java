package com.partyapp.query.user.dataAccess;

import com.partyapp.query.location.dataAccess.LocationDAO;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "app_user")
@Getter
@Setter
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
