package com.partyapp.commons.dataAccess.command.event.party;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "party")
public class PartyEventCommandDAO {
    @Id
    @Column(name = "id",nullable = false)
    private Long id;
    @Column(name = "dj_names")
    private String diskJockeys;
    @Column(name = "assistants_names")
    private String assistants;
    @Column(name = "party_type")
    private Integer partyTypeId;
}
