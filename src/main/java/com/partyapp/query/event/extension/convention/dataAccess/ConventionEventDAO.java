package com.partyapp.query.event.extension.convention.dataAccess;

import com.partyapp.query.event.dataAccess.BaseEventDAO;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "convention")
@Data
public class ConventionEventDAO {
    @Id
    @Column(name = "id", insertable = false, updatable = false)
    private Long id;
    @Column(name = "assistant_names")
    private String assistantNames;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id")
    private BaseEventDAO event;

    @ManyToOne
    @JoinColumn(name = "convention_type")
    private ConventionTypeDAO conventionType;
}
