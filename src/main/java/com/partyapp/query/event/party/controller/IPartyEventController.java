package com.partyapp.query.event.party.controller;

import com.partyapp.query.event.base.controller.IEventController;
import com.partyapp.query.event.party.service.PartyEventDTO;

import java.util.List;

public interface IPartyEventController extends IEventController {
    @Override
    public PartyEventDTO getEventDetail(Long id);

    @Override
    public List<PartyEventDTO> getAllEvents();
}
