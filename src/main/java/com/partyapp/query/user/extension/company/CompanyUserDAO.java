package com.partyapp.query.user.extension.company;

import com.partyapp.query.user.dataAccess.BaseUserDAO;

import javax.persistence.*;

@Entity
@Table(name = "company")
public class CompanyUserDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id")
    private BaseUserDAO userInfo;
}
