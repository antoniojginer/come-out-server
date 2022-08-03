package com.partyapp.query.event.base.service;

import com.partyapp.commons.entities.event.base.BaseEventDTO;

import java.util.List;

public interface IEventQueryService<T extends BaseEventDTO> {
    public BaseEventDTO getEventDetail(Long id);
    public List<T> getAllEvents();
}
