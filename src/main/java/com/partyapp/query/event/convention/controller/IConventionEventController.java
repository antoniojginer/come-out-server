package com.partyapp.query.event.convention.controller;

import com.partyapp.query.event.base.controller.IEventController;
import com.partyapp.query.event.convention.service.ConventionEventDTO;

import java.util.List;

public interface IConventionEventController extends IEventController {
    @Override
    public ConventionEventDTO getEventDetail(Long id);
    @Override
    public List<ConventionEventDTO> getAllEvents();
}
