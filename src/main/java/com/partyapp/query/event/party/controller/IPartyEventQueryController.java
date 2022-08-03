package com.partyapp.query.event.party.controller;

import com.partyapp.query.event.base.controller.IEventQueryController;
import com.partyapp.commons.entities.event.party.PartyEventDTO;

import java.util.List;

public interface IPartyEventQueryController extends IEventQueryController {
    @Override
    public PartyEventDTO getEventDetail(Long id);

    @Override
    public List<PartyEventDTO> getAllEvents();
}
