package com.partyapp.query.event.extension.show.service;

import com.partyapp.entities.event.party.PartyModel;
import com.partyapp.entities.event.show.ShowModel;
import com.partyapp.query.event.IEventService;

public interface IShowEventService extends IEventService {
    @Override
    public ShowModel getEventDetail(String id);
}
