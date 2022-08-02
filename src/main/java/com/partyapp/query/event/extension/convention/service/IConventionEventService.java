package com.partyapp.query.event.extension.convention.service;

import com.partyapp.query.event.service.IEventService;

public interface IConventionEventService extends IEventService {
    @Override
    public ConventionEventDTO getEventDetail(Long id);
}
