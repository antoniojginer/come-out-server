package com.partyapp.query.event.extension.party.controller;

import com.partyapp.entities.event.party.PartyModel;
import com.partyapp.query.event.extension.party.service.IPartyEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("event/party")
public class PartyEventController implements IPartyEventController {

    @Autowired
    private IPartyEventService partyEventService;

    @Override
    @GetMapping("/{id}")
    public PartyModel getEventDetail(@PathVariable(value = "id") String id) {
        return partyEventService.getEventDetail(id);
    }
}
