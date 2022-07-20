package com.partyapp.query.event;

import com.partyapp.entities.event.BaseEventModel;

public interface IEventController {

    public BaseEventModel getEventDetail(String id);
}
