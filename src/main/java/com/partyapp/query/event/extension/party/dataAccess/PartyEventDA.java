package com.partyapp.query.event.extension.party.dataAccess;

import com.partyapp.query.event.extension.party.dataAccess.jpaRepository.PartyEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PartyEventDA implements IPartyEventDA {

    @Autowired
    private PartyEventRepository partyEventRepository;

    public PartyEventDAO getPartyEventDetail(Long id) {
        Optional<PartyEventDAO> partyEventDAO = partyEventRepository.findById(id);
        return partyEventDAO.get();
    }

    public List<PartyEventDAO> getAllPartyEvents() {
        List<PartyEventDAO> partyEventDAOList = partyEventRepository.findAll();
        return partyEventDAOList;
    }
}
