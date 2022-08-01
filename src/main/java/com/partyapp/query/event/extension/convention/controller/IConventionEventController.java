package com.partyapp.query.event.extension.convention.controller;

import com.partyapp.entities.event.BaseEventModel;
import com.partyapp.entities.event.convention.ConventionModel;
import com.partyapp.query.event.IEventController;

public interface IConventionEventController extends IEventController {
    public ConventionModel getEventDetail(Long id);
}
