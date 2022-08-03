package com.partyapp.query.event.extension.party.controller;

import com.partyapp.query.event.controller.IEventController;
import com.partyapp.query.event.extension.party.service.PartyEventDTO;

import java.util.List;

public interface IPartyEventController extends IEventController {
    @Override
    public PartyEventDTO getEventDetail(Long id);

    @Override
    public List<PartyEventDTO> getAllEvents();
}
