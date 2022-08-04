package com.partyapp.query.event.party.controller;

import com.partyapp.query.event.party.service.IPartyEventQueryService;
import com.partyapp.commons.entities.event.party.PartyEventDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("event/party")
@RestController
public class PartyEventQueryController implements IPartyEventQueryController {

    @Autowired
    private IPartyEventQueryService partyEventService;

    @Override
    @GetMapping("/{id}")
    public PartyEventDTO getEventDetail(@PathVariable("id") Long id) {
        PartyEventDTO event = partyEventService.getEventDetail(id);
        return event;
    }

    @Override
    @GetMapping("")
    public List<PartyEventDTO> getAllEvents() {
        return partyEventService.getAllEvents();
    }
}
