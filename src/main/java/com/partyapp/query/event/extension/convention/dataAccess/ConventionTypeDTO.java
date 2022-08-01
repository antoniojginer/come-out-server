package com.partyapp.query.event.extension.convention.dataAccess;

import javax.persistence.*;

@Entity
@Table(name = "convention_type")
public class ConventionTypeDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Integer id;

    @Column(name = "name")
    private String name;
}
