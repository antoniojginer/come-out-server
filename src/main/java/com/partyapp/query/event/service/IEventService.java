package com.partyapp.query.event.service;

public interface IEventService <T extends BaseEventDTO> {
    public BaseEventDTO getEventDetail(Long id);
}
