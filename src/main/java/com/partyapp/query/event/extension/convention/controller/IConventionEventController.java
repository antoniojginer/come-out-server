package com.partyapp.query.event.extension.convention.controller;

import com.partyapp.query.event.controller.IEventController;
import com.partyapp.query.event.extension.convention.service.ConventionEventDTO;

import java.util.List;

public interface IConventionEventController extends IEventController {
    @Override
    public ConventionEventDTO getEventDetail(Long id);
    @Override
    public List<ConventionEventDTO> getAllEvents();
}
