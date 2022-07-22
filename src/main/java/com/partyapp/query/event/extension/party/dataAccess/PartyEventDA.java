package com.partyapp.query.event.extension.party.dataAccess;

import org.springframework.stereotype.Service;

@Service
public class PartyEventDA implements IPartyEventDA{
    @Override
    public PartyEventDAO getEventDetail(String id) {
        return new PartyEventDAO();
    }
}
