package com.partyapp.commons.dataAccess.query.event.convention;

import com.partyapp.commons.dataAccess.query.event.base.BaseEventDAO;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "convention")
@Data
public class ConventionEventDAO {
    @Id
    @Column(name = "id", insertable = false, updatable = false)
    private Long id;
    @Column(name = "assistants_name")
    private String assistants;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id")
    private BaseEventDAO event;

    @ManyToOne
    @JoinColumn(name = "convention_type")
    private ConventionTypeDAO conventionType;
}
