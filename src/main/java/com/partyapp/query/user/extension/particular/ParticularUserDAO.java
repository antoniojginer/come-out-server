package com.partyapp.query.user.extension.particular;

import com.partyapp.query.user.dataAccess.BaseUserDAO;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "particular")
public class ParticularUserDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "birthdate")
    @Temporal(TemporalType.DATE)
    private Date birthdate;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id")
    private BaseUserDAO userInfo;
}
