package com.partyapp.query.event.party.service;

import com.partyapp.commons.entities.event.party.PartyEventDTO;
import com.partyapp.commons.mapper.QueryMapper;
import com.partyapp.query.event.party.dataAccess.IPartyEventQueryDA;
import com.partyapp.commons.dataAccess.query.event.party.PartyEventDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PartyEventQueryService implements IPartyEventQueryService {
    @Autowired
    private IPartyEventQueryDA partyEventDA;

    @Autowired
    private QueryMapper mapper;

    @Override
    public PartyEventDTO getEventDetail(Long id) {
        PartyEventDAO partyEventDAO = partyEventDA.getPartyEventDetail(id);
        PartyEventDTO res = mapper.toPartyEventDetailDto(partyEventDAO);
        return res;
    }

    @Override
    public List<PartyEventDTO> getAllEvents() {
        List<PartyEventDAO> partyEventList = partyEventDA.getAllPartyEvents();
        return partyEventList
                .stream()
                .map(event -> mapper.toPartyEventDetailDto(event))
                .collect(Collectors.toList());
    }

    @Override
    public Integer getEventAssistance(Long id) {
        return partyEventDA.getPartyEventAssistance(id);
    }
}
