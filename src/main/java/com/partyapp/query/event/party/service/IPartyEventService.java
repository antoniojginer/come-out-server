package com.partyapp.query.event.party.service;

import com.partyapp.query.event.base.service.IEventService;

import java.util.List;

public interface IPartyEventService extends IEventService {
    @Override
    public PartyEventDTO getEventDetail(Long id);

    @Override
    public List<PartyEventDTO> getAllEvents();
}
