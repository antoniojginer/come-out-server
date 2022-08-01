package com.partyapp.query.event.extension.convention.dataAccess;

import com.partyapp.query.event.BaseEventDAO;

import javax.persistence.*;

@Entity
@Table(name = "convention")
public class ConventionEventDAO {
    @Id
    @Column(name = "id", insertable = false, updatable = false)
    private Long id;
    @Column(name = "assistant_names")
    private String assistant_names;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id")
    private BaseEventDAO event;

    @ManyToOne
    @JoinColumn(name = "convention_type")
    private ConventionTypeDTO conventionType;
}
