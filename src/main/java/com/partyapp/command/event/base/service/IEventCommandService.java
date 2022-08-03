package com.partyapp.command.event.base.service;

import com.partyapp.commons.entities.event.base.BaseEventDTO;

public interface IEventCommandService<T extends BaseEventDTO> {
    public BaseEventDTO createEvent(T event);
    public BaseEventDTO modifyEvent(T event, Long id);
}
