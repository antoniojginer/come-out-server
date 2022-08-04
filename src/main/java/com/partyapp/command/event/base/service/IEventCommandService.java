package com.partyapp.command.event.base.service;

import com.partyapp.commons.entities.event.base.BaseEventDTO;

public interface IEventCommandService<T extends BaseEventDTO> {
    public void createEvent(T event);
    public void modifyEvent(T event, Long id);
}
