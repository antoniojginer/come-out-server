package com.partyapp.query.event.party.service;

import com.partyapp.query.event.base.service.BaseEventDTO;
import lombok.Data;

import java.util.List;

@Data
public class PartyEventDTO extends BaseEventDTO {
    private List<String> diskJockeys;
    private List<String> assistants;
    private Integer partyTypeId;
    private String partyTypeName;
}
