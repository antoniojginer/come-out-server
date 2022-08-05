package com.partyapp.query.location.controller;

import com.partyapp.commons.entities.location.LocationDTO;
import com.partyapp.query.location.service.ILocationQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/location")
public class LocationQueryController implements ILocationQueryController {

    @Autowired
    private ILocationQueryService locationQueryService;

    @Override
    @GetMapping("/{id}")
    public LocationDTO getLocationById(@PathVariable("id") Long id) {
        return locationQueryService.getLocationById(id);
    }

    @Override
    @GetMapping("")
    public List<LocationDTO> getAllLocations() {
        return locationQueryService.getAllLocations();
    }
}
