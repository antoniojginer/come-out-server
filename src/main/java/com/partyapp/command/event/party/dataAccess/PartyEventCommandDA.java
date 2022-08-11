package com.partyapp.command.event.party.dataAccess;

import com.partyapp.command.event.party.dataAccess.jpaRepository.AssistanceEventCommandRepository;
import com.partyapp.command.event.party.dataAccess.jpaRepository.PartyEventCommandRepository;
import com.partyapp.commons.dataAccess.command.event.base.AssistantEventCommandDAO;
import com.partyapp.commons.dataAccess.command.event.party.PartyEventCommandDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import javax.transaction.Transactional;

@Service
public class PartyEventCommandDA implements IPartyEventCommandDA {

    @Autowired
    private PartyEventCommandRepository partyEventRepository;

    @Autowired
    private AssistanceEventCommandRepository assistanceEventCommandRepository;

    @Override
    @Transactional
    public PartyEventCommandDAO createPartyEvent(PartyEventCommandDAO partyEvent) {
        try {
            PartyEventCommandDAO res = partyEventRepository.save(partyEvent);
            if (res != null) {
                return res;
            }
        } catch (Exception e) {
            // TODO
            throw new RuntimeException();
        }
        throw new RuntimeException();
    }

    public void modifyPartyEvent(PartyEventCommandDAO event, Long id) {
        // TODO
    }

    @Override
    public AssistantEventCommandDAO addAssistantToEvent(AssistantEventCommandDAO request) {
        try {
            AssistantEventCommandDAO assistant = this.assistanceEventCommandRepository.save(request);
            if (assistant != null) {
                return assistant;
            }
        } catch (Exception e) {
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    "Error saving an assistant to party event"
            );
        }
        throw new ResponseStatusException(
                HttpStatus.INTERNAL_SERVER_ERROR,
                "Error saving an assistant to party event"
        );
    }
}
