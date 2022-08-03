package com.partyapp.query.event.service;

import java.util.List;

public interface IEventService <T extends BaseEventDTO> {
    public BaseEventDTO getEventDetail(Long id);
    public List<T> getAllEvents();
}
