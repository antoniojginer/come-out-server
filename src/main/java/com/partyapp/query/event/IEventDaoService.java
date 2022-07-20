package com.partyapp.query.event;

import com.partyapp.query.event.extension.party.dao.PartyEventDTO;

public interface IEventDaoService {
    public BaseEventDTO getEventDetail(String id);
}
