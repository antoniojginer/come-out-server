package com.partyapp.query.location.dataAccess;

import com.partyapp.commons.dataAccess.query.location.LocationDAO;

import java.util.List;

public interface ILocationQueryDA {
    public LocationDAO getLocationById(Long id);
    public List<LocationDAO> getAllLocations();
}
