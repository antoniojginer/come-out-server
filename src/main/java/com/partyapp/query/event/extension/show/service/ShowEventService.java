package com.partyapp.query.event.extension.show.service;

import com.partyapp.entities.event.party.PartyModel;
import com.partyapp.entities.event.show.ShowModel;
import com.partyapp.query.event.extension.show.dataAccess.IShowEventDA;
import com.partyapp.query.event.extension.show.dataAccess.ShowEventDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShowEventService implements IShowEventService {

    @Autowired
    private IShowEventDA showEventDao;

    @Override
    public ShowModel getEventDetail(String id) {
        // TODO
        ShowEventDAO showEventDTO = showEventDao.getEventDetail(id);
        return new ShowModel();
    }
}
