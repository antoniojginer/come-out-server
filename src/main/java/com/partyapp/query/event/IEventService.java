package com.partyapp.query.event;

import com.partyapp.entities.event.BaseEventModel;

public interface IEventService {
    public BaseEventModel getEventDetail(String id);
}
