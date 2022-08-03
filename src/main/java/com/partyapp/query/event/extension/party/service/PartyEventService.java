package com.partyapp.query.event.extension.party.service;

import com.partyapp.commons.mapper.DataAccessObjectToDataTransferObjectMapper;
import com.partyapp.query.event.extension.party.dataAccess.IPartyEventDA;
import com.partyapp.query.event.extension.party.dataAccess.PartyEventDAO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PartyEventService implements IPartyEventService{
    @Autowired
    private IPartyEventDA partyEventDA;

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
