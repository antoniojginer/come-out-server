package com.partyapp.command.event.party.dataAccess;

import com.partyapp.command.event.party.dataAccess.jpaRepository.PartyEventCommandRepository;
import com.partyapp.commons.dataAccess.event.party.PartyEventDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PartyEventCommandDA implements IPartyEventCommandDA {

    @Autowired
    private PartyEventCommandRepository partyEventRepository;

    @Override
    public PartyEventDAO createPartyEvent(PartyEventDAO event) {
        // TODO
        return new PartyEventDAO();
    }

    public PartyEventDAO modifyPartyEvent(PartyEventDAO event, Long id) {
        // TODO
        return new PartyEventDAO();
    }
}
