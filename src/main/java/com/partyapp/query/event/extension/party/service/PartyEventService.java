package com.partyapp.query.event.extension.party.service;

import com.partyapp.entities.event.party.PartyModel;
import com.partyapp.query.event.extension.party.dataAccess.IPartyEventDA;
import com.partyapp.query.event.extension.party.dataAccess.PartyEventDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PartyEventService implements IPartyEventService{

    @Autowired
    private IPartyEventDA partyEventDao;

    @Override
    public PartyModel getEventDetail(String id) {
        // TODO
        PartyEventDAO partyEventDTO = partyEventDao.getEventDetail(id);
        return new PartyModel();
    }
}
