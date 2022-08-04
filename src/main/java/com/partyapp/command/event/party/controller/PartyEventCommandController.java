package com.partyapp.command.event.party.controller;

import com.partyapp.command.event.party.service.IPartyEventCommandService;
import com.partyapp.commons.entities.event.party.PartyEventDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("event/party")
public class PartyEventCommandController implements IPartyEventCommandController {

    @Autowired
    private IPartyEventCommandService partyEventService;

    @Override
    @PutMapping("")
    public void createEvent(@RequestBody PartyEventDTO request) {
        partyEventService.createEvent(request);
    }

    @Override
    @PostMapping("/{id}")
    public void modifyEvent(@RequestBody PartyEventDTO request, Long id) {
        partyEventService.modifyEvent(request, id);
    }
}
