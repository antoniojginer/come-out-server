package com.partyapp.query.event.extension.convention.service;

import com.partyapp.entities.event.convention.ConventionModel;
import com.partyapp.query.event.extension.convention.dataAccess.IConventionEventDA;
import com.partyapp.query.event.extension.convention.dataAccess.ConventionEventDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConventionEventService implements IConventionEventService {

    @Autowired
    private IConventionEventDA conventionEventDao;

    @Override
    public ConventionModel getEventDetail(String id) {
        // TODO
        ConventionEventDAO conventionEventDTO = conventionEventDao.getEventDetail(id);
        return new ConventionModel();
    }
}
