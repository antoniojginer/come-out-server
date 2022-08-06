package com.partyapp.commons.dataAccess.command.country;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "country")
@Data
public class CountryCommandDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "country_generator")
    @SequenceGenerator(name = "country_generator", sequenceName = "country_id_seq", allocationSize = 1)
    @Column(name = "id", updatable = false, nullable = false)
    private int id;

    @Column(name = "name")
    private String name;
}
