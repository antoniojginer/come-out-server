package com.partyapp.query.event.extension.show.controller;

import com.partyapp.entities.event.party.PartyModel;
import com.partyapp.query.event.extension.show.service.IShowEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("event/show")
public class ShowEventController implements IShowEventController {

    @Autowired
    private IShowEventService showEventService;

    @Override
    @GetMapping("/{id}")
    public PartyModel getEventDetail(@PathVariable(value = "id") String id) {
        return showEventService.getEventDetail(id);
    }
}
