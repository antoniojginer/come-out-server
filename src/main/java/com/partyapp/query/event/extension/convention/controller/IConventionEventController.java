package com.partyapp.query.event.extension.convention.controller;

import com.partyapp.query.event.controller.IEventController;
import com.partyapp.query.event.extension.convention.service.ConventionEventDTO;

public interface IConventionEventController extends IEventController {
    public ConventionEventDTO getEventDetail(Long id);
}
