package com.partyapp.query.location.service;

import com.partyapp.commons.entities.location.LocationDTO;

import java.util.List;

public interface ILocationQueryService {
    public LocationDTO getLocationById(Long id);
    public List<LocationDTO> getAllLocations();
}
