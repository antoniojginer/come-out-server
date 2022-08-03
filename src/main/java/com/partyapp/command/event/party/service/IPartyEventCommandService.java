package com.partyapp.command.event.party.service;

import com.partyapp.command.event.base.service.IEventCommandService;
import com.partyapp.commons.entities.event.party.PartyEventDTO;

public interface IPartyEventCommandService extends IEventCommandService<PartyEventDTO> {
    @Override
    public PartyEventDTO createEvent(PartyEventDTO event);

    @Override
    public PartyEventDTO modifyEvent(PartyEventDTO event, Long id);
}
