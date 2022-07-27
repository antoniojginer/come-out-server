package com.partyapp.query.event.extension.sport.dataAccess;

import org.springframework.stereotype.Service;

@Service
public class SportEventDA implements ISportEventDA {
    @Override
    public SportEventDAO getEventDetail(String id) {
        return new SportEventDAO();
    }
}
