package com.partyapp.query.event.extension.convention.service;

import com.partyapp.entities.event.convention.ConventionModel;
import com.partyapp.entities.event.party.PartyModel;
import com.partyapp.query.event.IEventService;

public interface IConventionEventService extends IEventService {
    @Override
    public ConventionModel getEventDetail(String id);
}
