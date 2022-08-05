package com.partyapp.query.location.controller;

import com.partyapp.commons.entities.location.LocationDTO;

import java.util.List;

public interface ILocationQueryController {
    public LocationDTO getLocationById(Long id);
    public List<LocationDTO> getAllLocations();
}
