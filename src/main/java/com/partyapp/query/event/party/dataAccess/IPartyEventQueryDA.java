package com.partyapp.query.event.party.dataAccess;

import com.partyapp.commons.dataAccess.event.party.PartyEventDAO;

import java.util.List;

public interface IPartyEventQueryDA {
    public PartyEventDAO getPartyEventDetail(Long id);
    public List<PartyEventDAO> getAllPartyEvents();
}
