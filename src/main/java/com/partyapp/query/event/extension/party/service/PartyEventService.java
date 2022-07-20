package com.partyapp.query.event.extension.party.service;

import com.partyapp.entities.event.party.PartyModel;
import com.partyapp.query.event.extension.party.dao.IPartyEventDao;
import com.partyapp.query.event.extension.party.dao.PartyEventDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PartyEventService implements IPartyEventService{

    @Autowired
    private IPartyEventDao partyEventDao;
    @Override
    public PartyModel getEventDetail(String id) {
        // TODO
        PartyEventDTO partyEventDTO = partyEventDao.getEventDetail(id);
        return new PartyModel();
    }
}
