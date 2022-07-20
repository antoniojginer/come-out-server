package com.partyapp.query.event.extension.party.dao;

import com.partyapp.query.event.BaseEventDTO;
import lombok.Data;

@Data
public class PartyEventDTO extends BaseEventDTO {
    private String assistantNames;
    private String djNames;
    private String type;
}
