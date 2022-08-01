package com.partyapp.query.event;

import com.partyapp.entities.event.BaseEventModel;

import java.util.List;

public interface IEventService <T extends BaseEventModel> {
    public BaseEventModel getEventDetail(Long id);
}
