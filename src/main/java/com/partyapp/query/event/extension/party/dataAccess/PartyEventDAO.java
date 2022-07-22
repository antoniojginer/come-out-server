package com.partyapp.query.event.extension.party.dataAccess;

import com.partyapp.query.event.BaseEventDAO;
import lombok.Data;

@Data
public class PartyEventDAO extends BaseEventDAO {
    private String assistantNames;
    private String djNames;
    private String type;
}
