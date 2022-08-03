package com.partyapp.command.event.party.service;

import com.partyapp.command.event.party.dataAccess.IPartyEventCommandDA;
import com.partyapp.commons.entities.event.party.PartyEventDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PartyEventCommandService implements IPartyEventCommandService {

    @Autowired
    private IPartyEventCommandDA partyEventDA;

    @Override
    public PartyEventDTO createEvent(PartyEventDTO event) {
        // TODO
        return new PartyEventDTO();
    }

    public PartyEventDTO modifyEvent(PartyEventDTO event, Long id) {
        // TODO
        return new PartyEventDTO();
    }
}
