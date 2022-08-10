package com.partyapp.query.event.party.dataAccess;

import com.partyapp.commons.dataAccess.query.event.party.PartyEventDAO;
import com.partyapp.query.event.party.dataAccess.jpaRepository.AssistanceEventQueryRepository;
import com.partyapp.query.event.party.dataAccess.jpaRepository.PartyEventQueryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class PartyEventQueryDA implements IPartyEventQueryDA {

    @Autowired
    private PartyEventQueryRepository partyEventRepository;

    @Autowired
    private AssistanceEventQueryRepository assistanceEventQueryRepository;

    public PartyEventDAO getPartyEventDetail(Long id) {
        try {
            Optional<PartyEventDAO> partyEventDAO = partyEventRepository.findById(id);
            if (!partyEventDAO.isEmpty()) {
                return partyEventDAO.get();
            }
        } catch (Exception e) {
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    "Error getting a convention event"
            );
        }
        throw new ResponseStatusException(
                HttpStatus.NOT_FOUND,
                "Convention event not found"
        );
    }

    public List<PartyEventDAO> getAllPartyEvents() {
        List<PartyEventDAO> partyEventDAOList = partyEventRepository.findAll();
        return partyEventDAOList;
    }

    @Override
    public Integer getPartyEventAssistance(Long id) {
        Integer totalAssistance = assistanceEventQueryRepository.getEventAssistance(id);
        return totalAssistance;
    }
}
