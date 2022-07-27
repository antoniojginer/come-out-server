package com.partyapp.query.event.extension.sport.service;

import com.partyapp.entities.event.sport.SportModel;
import com.partyapp.query.event.extension.sport.dataAccess.ISportEventDA;
import com.partyapp.query.event.extension.sport.dataAccess.SportEventDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SportEventService implements ISportEventService {

    @Autowired
    private ISportEventDA sportEventDao;

    @Override
    public SportModel getEventDetail(String id) {
        // TODO
        SportEventDAO sportEventDTO = sportEventDao.getEventDetail(id);
        // MAPPER
        return new SportModel();
    }
}
