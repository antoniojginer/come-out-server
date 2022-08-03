package com.partyapp.query.event.convention.controller;

import com.partyapp.query.event.convention.service.ConventionEventDTO;
import com.partyapp.query.event.convention.service.IConventionEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("event/convention")
public class ConventionEventController implements IConventionEventController {

    @Autowired
    private IConventionEventService conventionEventService;

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

}
