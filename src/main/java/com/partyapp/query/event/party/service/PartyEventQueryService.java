package com.partyapp.query.event.party.service;

import com.partyapp.commons.entities.event.party.PartyEventDTO;
import com.partyapp.commons.mapper.DataAccessObjectToDataTransferObjectMapper;
import com.partyapp.query.event.party.dataAccess.IPartyEventQueryDA;
import com.partyapp.commons.dataAccess.event.party.PartyEventDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PartyEventQueryService implements IPartyEventQueryService {
    @Autowired
    private IPartyEventQueryDA partyEventDA;

    @Autowired
    private DataAccessObjectToDataTransferObjectMapper mapper;

    @Override
    public PartyEventDTO getEventDetail(Long id) {
        PartyEventDAO partyEventDAO = partyEventDA.getPartyEventDetail(id);
        return mapper.toPartyEventDetailDto(partyEventDAO);
    }

    @Override
    public List<PartyEventDTO> getAllEvents() {
        List<PartyEventDAO> partyEventList = partyEventDA.getAllPartyEvents();
        return partyEventList
                .stream()
                .map(event -> mapper.toPartyEventDetailDto(event))
                .collect(Collectors.toList());
    }
}
