package com.partyapp.query.location.dataAccess;

import com.partyapp.commons.dataAccess.query.location.LocationDAO;
import com.partyapp.query.location.dataAccess.jpaRepository.LocationQueryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class LocationQueryDA implements ILocationQueryDA {

    @Autowired
    private LocationQueryRepository locationQueryRepository;

    @Override
    public LocationDAO getLocationById(Long id) {
        try {
            Optional<LocationDAO> locationDAO = locationQueryRepository.findById(id);
            if (!locationDAO.isEmpty()) {
                return locationDAO.get();
            }
        } catch (Exception e) {
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    "Error in get location detail query"
            );
        }
        throw new ResponseStatusException(
                HttpStatus.NOT_FOUND,
                "Location detail not found"
        );
    }

    @Override
    public List<LocationDAO> getAllLocations() {
        try {
            List<LocationDAO> locationDAO = locationQueryRepository.findAll();
            if (!locationDAO.isEmpty()) {
                return locationDAO;
            }
        } catch (Exception e) {
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    "Error in get all locations query"
            );
        }
        throw new ResponseStatusException(
                HttpStatus.NOT_FOUND,
                "Location list is empty"
        );
    }
}
