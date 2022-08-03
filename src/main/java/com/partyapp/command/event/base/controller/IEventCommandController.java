package com.partyapp.command.event.base.controller;

import com.partyapp.commons.entities.event.base.BaseEventDTO;

public interface IEventCommandController<T extends BaseEventDTO> {
    public BaseEventDTO createEvent(T request);
    public BaseEventDTO modifyEvent(T request, Long id);
}
