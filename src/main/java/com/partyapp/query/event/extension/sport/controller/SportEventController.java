package com.partyapp.query.event.extension.sport.controller;

import com.partyapp.entities.event.party.PartyModel;
import com.partyapp.entities.event.sport.SportModel;
import com.partyapp.query.event.extension.sport.service.ISportEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("event/sport")
public class SportEventController implements ISportEventController {

    @Autowired
    private ISportEventService sportEventService;

    @Override
    @GetMapping("/{id}")
    public SportModel getEventDetail(@PathVariable(value = "id") String id) {
        return sportEventService.getEventDetail(id);
    }
}
