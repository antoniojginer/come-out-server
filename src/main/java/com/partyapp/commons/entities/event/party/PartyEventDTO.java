package com.partyapp.commons.entities.event.party;

import com.partyapp.commons.entities.event.base.BaseEventDTO;
import lombok.Data;

import java.util.List;

@Data
public class PartyEventDTO extends BaseEventDTO {
    private List<String> diskJockeys;
    private List<String> assistants;
    private Integer partyTypeId;
    private String partyTypeName;
}
