package com.partyapp.command.event.party.service;

import com.partyapp.command.event.base.dataAccess.IBaseEventCommandDA;
import com.partyapp.command.event.party.dataAccess.IPartyEventCommandDA;
import com.partyapp.command.location.service.ILocationCommandService;
import com.partyapp.commons.dataAccess.command.event.base.BaseEventCommandDAO;
import com.partyapp.commons.dataAccess.command.event.party.PartyEventCommandDAO;
import com.partyapp.commons.entities.event.party.PartyEventDTO;
import com.partyapp.commons.entities.location.LocationDTO;
import com.partyapp.commons.mapper.CommandMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PartyEventCommandService implements IPartyEventCommandService {

    @Autowired
    private IPartyEventCommandDA partyEventDA;

    @Autowired
    IBaseEventCommandDA baseEventCommandDA;

    @Autowired
    private ILocationCommandService locationCommandService;

    @Autowired
    private CommandMapper mapper;

    @Override
    @Transactional
    public PartyEventDTO createEvent(PartyEventDTO event) {
        if (event.getLocation().getId() == null) {
            LocationDTO locationDTO = locationCommandService.saveLocation(event.getLocation());
            event.setLocation(locationDTO);
        }
        BaseEventCommandDAO baseEvent = baseEventCommandDA.createBaseEvent(
            mapper.toBaseEventCommandDAO(event)
        );
        event.setId(baseEvent.getId());
        partyEventDA.createPartyEvent(mapper.toPartyEventCommandDAO(event));
        return event;
    }

    public void modifyEvent(PartyEventDTO event, Long id) {
        // TODO
    }
}
