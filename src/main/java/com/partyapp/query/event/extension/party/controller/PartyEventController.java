package com.partyapp.query.event.extension.party.controller;

import com.partyapp.query.event.extension.party.service.IPartyEventService;
import com.partyapp.query.event.extension.party.service.PartyEventDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("event/party")
@Controller
public class PartyEventController implements IPartyEventController{

    @Autowired
    private IPartyEventService partyEventService;

    @Override
    @GetMapping("/{id}")
    public PartyEventDTO getEventDetail(Long id) {
        return partyEventService.getEventDetail(id);
    }

    @Override
    @GetMapping("")
    public List<PartyEventDTO> getAllEvents() {
        return partyEventService.getAllEvents();
    }
}
