package com.partyapp.command.event.party.controller;

import com.partyapp.command.event.base.controller.IEventCommandController;
import com.partyapp.commons.entities.event.party.PartyEventDTO;

public interface IPartyEventCommandController extends IEventCommandController<PartyEventDTO> {
    @Override
    public PartyEventDTO createEvent(PartyEventDTO request);
    @Override
    public void modifyEvent(PartyEventDTO request, Long id);
}
