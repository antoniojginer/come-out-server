package com.partyapp.query.event.extension.convention.dataAccess;

import com.partyapp.query.event.IEventDAService;

public interface IConventionEventDA extends IEventDAService {
    @Override ConventionEventDAO getEventDetail(String id);
}
