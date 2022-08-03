package com.partyapp.query.event.convention.controller;

import com.partyapp.query.event.base.controller.IEventQueryController;
import com.partyapp.commons.entities.event.convention.ConventionEventDTO;

import java.util.List;

public interface IConventionEventQueryController extends IEventQueryController {
    @Override
    public ConventionEventDTO getEventDetail(Long id);
    @Override
    public List<ConventionEventDTO> getAllEvents();
}
