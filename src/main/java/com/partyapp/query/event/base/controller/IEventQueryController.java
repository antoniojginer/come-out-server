package com.partyapp.query.event.base.controller;

import com.partyapp.commons.entities.event.base.BaseEventDTO;

import java.util.List;

public interface IEventQueryController<T extends BaseEventDTO> {

    public BaseEventDTO getEventDetail(Long id);
    public List<T> getAllEvents();
}
