package com.partyapp.command.location.service;

import com.partyapp.commons.entities.location.LocationDTO;

public interface ILocationCommandService {
    public LocationDTO saveLocation(LocationDTO request);
    public void deleteLocation(LocationDTO request, Long id);
    public LocationDTO updateLocation(LocationDTO request, Long id);
}
