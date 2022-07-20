package com.partyapp.query.event.extension.party.service;

import com.partyapp.entities.event.party.PartyModel;
import com.partyapp.query.event.IEventService;

public interface IPartyEventService extends IEventService {
    @Override
    public PartyModel getEventDetail(String id);
}
