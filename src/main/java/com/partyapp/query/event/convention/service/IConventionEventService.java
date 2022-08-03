package com.partyapp.query.event.convention.service;

import com.partyapp.query.event.base.service.IEventService;

import java.util.List;

public interface IConventionEventService extends IEventService {
    @Override
    public ConventionEventDTO getEventDetail(Long id);
    @Override
    public List<ConventionEventDTO> getAllEvents();
}
