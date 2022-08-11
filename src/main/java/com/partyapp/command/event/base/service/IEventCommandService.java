package com.partyapp.command.event.base.service;

import com.partyapp.commons.entities.event.AssistantEventDTO;
import com.partyapp.commons.entities.event.base.BaseEventDTO;
import com.partyapp.commons.entities.event.party.PartyEventDTO;

public interface IEventCommandService<T extends BaseEventDTO> {
    public PartyEventDTO createEvent(T event);
    public void modifyEvent(T event, Long id);
    AssistantEventDTO addAssistantToEvent(AssistantEventDTO request);
}
