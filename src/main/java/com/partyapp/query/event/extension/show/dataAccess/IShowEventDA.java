package com.partyapp.query.event.extension.show.dataAccess;

import com.partyapp.query.event.IEventDAService;

public interface IShowEventDA extends IEventDAService {
    @Override ShowEventDAO getEventDetail(String id);
}
