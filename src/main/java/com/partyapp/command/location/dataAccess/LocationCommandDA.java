package com.partyapp.command.location.dataAccess;

import com.partyapp.command.location.dataAccess.jpaRepository.LocationCommandRepository;
import com.partyapp.commons.dataAccess.command.location.LocationCommandDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class LocationCommandDA implements ILocationCommandDA {

    @Autowired
    private LocationCommandRepository locationCommandRepository;


    @Override
    public LocationCommandDAO saveLocation(LocationCommandDAO request) {
        try {
            LocationCommandDAO locationSaved = locationCommandRepository.save(request);
            if (locationSaved != null) {
                return locationSaved;
            }
        } catch (Exception e) {
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    "Error saving location"
            );
        }
        throw new ResponseStatusException(
                HttpStatus.INTERNAL_SERVER_ERROR,
                "Error saving location"
        );
    }

    @Override
    public void deleteLocation(Long id) {
        try {
            locationCommandRepository.deleteById(id);
        } catch (Exception e) {
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    "Error deleting location"
            );
        }
    }

    @Override
    public LocationCommandDAO updateLocation(Long id, LocationCommandDAO request) {
        // TODO
        return null;
    }
}
