package com.partyapp.query.event.convention.service;

import com.partyapp.query.event.base.service.IEventQueryService;
import com.partyapp.commons.entities.event.convention.ConventionEventDTO;

import java.util.List;

public interface IConventionEventQueryService extends IEventQueryService {
    @Override
    public ConventionEventDTO getEventDetail(Long id);
    @Override
    public List<ConventionEventDTO> getAllEvents();
}
