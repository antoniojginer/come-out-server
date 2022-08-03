package com.partyapp.query.event.extension.convention.service;

import com.partyapp.query.event.service.IEventService;

import java.util.List;

public interface IConventionEventService extends IEventService {
    @Override
    public ConventionEventDTO getEventDetail(Long id);
    @Override
    public List<ConventionEventDTO> getAllEvents();
}
