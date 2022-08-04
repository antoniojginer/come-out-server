package com.partyapp.command.event.party.service;

import com.partyapp.command.event.base.service.IEventCommandService;
import com.partyapp.commons.entities.event.party.PartyEventDTO;

public interface IPartyEventCommandService extends IEventCommandService<PartyEventDTO> {
    @Override
    public void createEvent(PartyEventDTO event);

    @Override
    public void modifyEvent(PartyEventDTO event, Long id);
}
