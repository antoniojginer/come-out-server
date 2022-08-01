package com.partyapp.query.event.extension.convention.service;

import com.partyapp.entities.event.BaseEventModel;
import com.partyapp.entities.event.convention.ConventionModel;
import com.partyapp.query.event.IEventService;

public interface IConventionEventService extends IEventService {
    public ConventionModel getEventDetail(Long id);
}
