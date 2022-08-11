package com.partyapp.command.location.controller;

import com.partyapp.command.location.service.ILocationCommandService;
import com.partyapp.commons.entities.location.LocationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/location")
public class LocationCommandController implements ILocationCommandController {

    @Autowired
    private ILocationCommandService locationCommandService;

    @PutMapping("")
    @Override
    public LocationDTO saveLocality(@RequestBody LocationDTO request) {
        return locationCommandService.saveLocation(request);
    }
}
