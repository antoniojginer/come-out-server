package com.partyapp.query.event.extension.convention.dataAccess;

import org.springframework.stereotype.Service;

@Service
public class ConventionEventDA implements IConventionEventDA {
    @Override
    public ConventionEventDAO getEventDetail(String id) {
        return new ConventionEventDAO();
    }
}
