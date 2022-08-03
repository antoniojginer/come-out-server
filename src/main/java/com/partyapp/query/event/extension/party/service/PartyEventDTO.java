package com.partyapp.query.event.extension.party.service;

import com.partyapp.query.event.service.BaseEventDTO;
import lombok.Data;

import java.util.List;

@Data
public class PartyEventDTO extends BaseEventDTO {
    private List<String> diskJockeys;
    private List<String> assistants;
    private Integer partyTypeId;
    private String partyTypeName;
}
