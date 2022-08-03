package com.partyapp.query.event.party.service;

import com.partyapp.commons.entities.event.party.PartyEventDTO;
import com.partyapp.query.event.base.service.IEventQueryService;

import java.util.List;

public interface IPartyEventQueryService extends IEventQueryService {
    @Override
    public PartyEventDTO getEventDetail(Long id);

    @Override
    public List<PartyEventDTO> getAllEvents();
}
