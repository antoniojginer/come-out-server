package com.partyapp.query.event.extension.party.dao;

import com.partyapp.query.event.IEventDaoService;

public interface IPartyEventDao extends IEventDaoService {
    @Override
    PartyEventDTO getEventDetail(String id);
}
