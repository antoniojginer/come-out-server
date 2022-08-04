package com.partyapp.query.event.party.dataAccess;

import com.partyapp.commons.dataAccess.query.event.party.PartyEventDAO;
import com.partyapp.query.event.party.dataAccess.jpaRepository.PartyEventQueryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PartyEventQueryDA implements IPartyEventQueryDA {

    @Autowired
    private PartyEventQueryRepository partyEventRepository;

    public PartyEventDAO getPartyEventDetail(Long id) {
        Optional<PartyEventDAO> partyEventDAO = partyEventRepository.findById(id);
        return partyEventDAO.get();
    }

    public List<PartyEventDAO> getAllPartyEvents() {
        List<PartyEventDAO> partyEventDAOList = partyEventRepository.findAll();
        return partyEventDAOList;
    }
}
