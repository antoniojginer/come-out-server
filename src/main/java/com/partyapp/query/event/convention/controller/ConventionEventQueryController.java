package com.partyapp.query.event.convention.controller;

import com.partyapp.commons.entities.event.convention.ConventionEventDTO;
import com.partyapp.query.event.convention.service.IConventionEventQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("event/convention")
public class ConventionEventQueryController implements IConventionEventQueryController {

    @Autowired
    private IConventionEventQueryService conventionEventService;

    @Override
    @GetMapping("/{id}")
    public ConventionEventDTO getEventDetail(@PathVariable(value = "id") Long id) {
        return conventionEventService.getEventDetail(id);
    }

    @Override
    @GetMapping("")
    public List<ConventionEventDTO> getAllEvents() {
        return conventionEventService.getAllEvents();
    }

    @Override
    @GetMapping("/assistance/{id}")
    public Integer getEventAssistance(@PathVariable(value = "id") Long id) {
        return null;
    }

}
