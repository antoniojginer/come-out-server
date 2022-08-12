package com.partyapp.commons.dataAccess.command.user.base;

import com.partyapp.commons.dataAccess.query.location.LocationDAO;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "app_user")
@Getter
@Setter
public class BaseUserCommandDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_generator")
    @SequenceGenerator(name = "user_generator", sequenceName = "user_id_seq", allocationSize = 1)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "location_id")
    private Long locationId;
}
