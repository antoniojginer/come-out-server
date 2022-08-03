package com.partyapp.query.event.extension.party.dataAccess;

import java.util.List;

public interface IPartyEventDA {
    public PartyEventDAO getPartyEventDetail(Long id);
    public List<PartyEventDAO> getAllPartyEvents();
}
