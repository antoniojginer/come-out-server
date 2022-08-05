package com.partyapp.command.location.service;

import com.partyapp.command.location.dataAccess.ILocationCommandDA;
import com.partyapp.commons.dataAccess.query.location.LocationDAO;
import com.partyapp.commons.entities.location.LocationDTO;
import com.partyapp.commons.mapper.CommandMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationCommandService implements ILocationCommandService {

    @Autowired
    private ILocationCommandDA locationCommandDA;

    @Autowired
    private CommandMapper commandMapper;

    @Override
    public void saveLocation(LocationDTO request) {
        LocationDAO locationDAO = null;
        locationCommandDA.saveLocation(null);
    }

    @Override
    public void deleteLocation(LocationDTO request, Long id) {
        // TODO
    }

    @Override
    public LocationDTO updateLocation(LocationDTO request, Long id) {
        // TODO
        return null;
    }
}
