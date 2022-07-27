package com.partyapp.query.event.extension.sport.dataAccess;

import com.partyapp.query.event.IEventDAService;

public interface ISportEventDA extends IEventDAService {
    @Override SportEventDAO getEventDetail(String id);
}
