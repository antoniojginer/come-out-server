package com.partyapp.query.event.extension.sport.service;

import com.partyapp.entities.event.party.PartyModel;
import com.partyapp.entities.event.sport.SportModel;
import com.partyapp.query.event.IEventService;

public interface ISportEventService extends IEventService {
    @Override
    public SportModel getEventDetail(String id);
}
