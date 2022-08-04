package com.partyapp.command.event.party.dataAccess;

import com.partyapp.command.event.party.dataAccess.jpaRepository.PartyEventCommandRepository;
import com.partyapp.commons.dataAccess.command.event.party.PartyEventCommandDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class PartyEventCommandDA implements IPartyEventCommandDA {

    @Autowired
    private PartyEventCommandRepository partyEventRepository;

    @Override
    @Transactional
    public void createPartyEvent(PartyEventCommandDAO partyEvent) {
        try {
            partyEventRepository.save(partyEvent);
        } catch (Exception e) {
            // TODO
            throw new RuntimeException();
        }
    }

    public void modifyPartyEvent(PartyEventCommandDAO event, Long id) {
        // TODO
    }
}
