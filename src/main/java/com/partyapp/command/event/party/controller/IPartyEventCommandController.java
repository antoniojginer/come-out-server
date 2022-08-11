package com.partyapp.command.event.party.controller;

import com.partyapp.command.event.base.controller.IEventCommandController;
import com.partyapp.commons.entities.event.AssistantEventDTO;
import com.partyapp.commons.entities.event.party.PartyEventDTO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface IPartyEventCommandController extends IEventCommandController<PartyEventDTO> {
    @Override
    public PartyEventDTO createEvent(PartyEventDTO request);
    @Override
    public void modifyEvent(PartyEventDTO request, Long id);
    @Override
    public AssistantEventDTO addAssistantsToEvent(AssistantEventDTO request);
}
