package com.partyapp.command.event.party.service;

import com.partyapp.command.event.base.dataAccess.IBaseEventCommandDA;
import com.partyapp.command.event.party.dataAccess.IPartyEventCommandDA;
import com.partyapp.commons.dataAccess.command.event.base.BaseEventCommandDAO;
import com.partyapp.commons.dataAccess.command.event.party.PartyEventCommandDAO;
import com.partyapp.commons.entities.event.party.PartyEventDTO;
import com.partyapp.commons.mapper.CommandMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PartyEventCommandService implements IPartyEventCommandService {

    @Autowired
    private IPartyEventCommandDA partyEventDA;

    @Autowired
    IBaseEventCommandDA baseEventCommandDA;

    @Autowired
    private CommandMapper mapper;

    @Override
    @Transactional
    public void createEvent(PartyEventDTO event) {
        // TODO
        if (event.getLocation().getId() == null) {
            // TODO insert location
        }
        BaseEventCommandDAO baseEvent = mapper.toBaseEventCommandDAO(event);
        baseEvent = baseEventCommandDA.createBaseEvent(baseEvent);
        if (baseEvent.getId() != null) { event.setId(baseEvent.getId()); }
        PartyEventCommandDAO partyEvent = mapper.toPartyEventCommandDAO(event);
        partyEventDA.createPartyEvent(partyEvent);
    }

    public void modifyEvent(PartyEventDTO event, Long id) {
        // TODO
    }
}
