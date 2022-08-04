package com.partyapp.command.event.base.controller;

import com.partyapp.commons.entities.event.base.BaseEventDTO;

public interface IEventCommandController<T extends BaseEventDTO> {
    public void createEvent(T request);
    public void modifyEvent(T request, Long id);
}
