package com.partyapp.command.event.party.controller;

import com.partyapp.command.event.party.service.IPartyEventCommandService;
import com.partyapp.commons.entities.event.party.PartyEventDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("event/party")
public class PartyEventCommandController implements IPartyEventCommandController {

    @Autowired
    private IPartyEventCommandService partyEventService;

    @Override
    @PutMapping("")
    @ResponseStatus(value = HttpStatus.CREATED)
    public PartyEventDTO createEvent(@RequestBody PartyEventDTO request) {
        return partyEventService.createEvent(request);
    }

    @Override
    @PostMapping("/{id}")
    public void modifyEvent(@RequestBody PartyEventDTO request, Long id) {
        partyEventService.modifyEvent(request, id);
    }
}
