package com.partyapp.query.event.extension.convention.controller;

import com.partyapp.entities.event.convention.ConventionModel;
import com.partyapp.query.event.extension.convention.service.IConventionEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("event/covention")
public class ConventionEventController implements IConventionEventController {

    @Autowired
    private IConventionEventService conventionEventService;

    @Override
    @GetMapping("/{id}")
    public ConventionModel getEventDetail(@PathVariable(value = "id") String id) {
        return conventionEventService.getEventDetail(id);
    }
}
