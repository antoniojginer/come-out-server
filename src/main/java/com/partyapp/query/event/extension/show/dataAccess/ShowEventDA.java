package com.partyapp.query.event.extension.show.dataAccess;

import org.springframework.stereotype.Service;

@Service
public class ShowEventDA implements IShowEventDA {
    @Override
    public ShowEventDAO getEventDetail(String id) {
        return new ShowEventDAO();
    }
}
