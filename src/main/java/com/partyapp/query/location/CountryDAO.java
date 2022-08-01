package com.partyapp.query.location;

import javax.persistence.*;

@Entity
@Table(name = "country")
public class CountryDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private int id;

    @Column(name = "name")
    private String name;
}
