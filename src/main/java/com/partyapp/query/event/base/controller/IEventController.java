package com.partyapp.query.event.base.controller;

import com.partyapp.query.event.base.service.BaseEventDTO;

import java.util.List;

public interface IEventController <T extends BaseEventDTO> {

    public BaseEventDTO getEventDetail(Long id);
    public List<T> getAllEvents();
}
