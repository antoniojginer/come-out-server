package com.partyapp.commons.dataAccess.user.company;

import com.partyapp.commons.dataAccess.user.base.BaseUserDAO;

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
