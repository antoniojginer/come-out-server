package com.partyapp.query.event.extension.convention.service;

import com.partyapp.entities.event.convention.ConventionModel;
import com.partyapp.query.event.service.IEventService;

public interface IConventionEventService extends IEventService {
    public ConventionModel getEventDetail(Long id);
}
