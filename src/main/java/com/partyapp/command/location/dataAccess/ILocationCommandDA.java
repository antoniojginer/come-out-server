package com.partyapp.command.location.dataAccess;

import com.partyapp.commons.dataAccess.command.location.LocationCommandDAO;
import com.partyapp.commons.dataAccess.query.location.LocationDAO;

public interface ILocationCommandDA {
    public LocationCommandDAO saveLocation(LocationCommandDAO request);
    public void deleteLocation(Long id);
    public LocationCommandDAO updateLocation(Long id, LocationCommandDAO request);
}
