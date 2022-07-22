package com.partyapp.query.event.extension.party.dataAccess;

import com.partyapp.query.event.IEventDAService;

public interface IPartyEventDA extends IEventDAService {
    @Override PartyEventDAO getEventDetail(String id);
}
