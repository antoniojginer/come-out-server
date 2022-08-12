package com.partyapp.command.event.base.controller;

import com.partyapp.commons.entities.event.AssistantEventDTO;
import com.partyapp.commons.entities.event.base.BaseEventDTO;
import com.partyapp.commons.entities.event.party.PartyEventDTO;

public interface IEventCommandController<T extends BaseEventDTO> {
    public PartyEventDTO createEvent(T request);
    public void modifyEvent(T request, Long id);
    public AssistantEventDTO addAssistantsToEvent(AssistantEventDTO request);
    public void deleteAssistantsToEvent(AssistantEventDTO request);
}
