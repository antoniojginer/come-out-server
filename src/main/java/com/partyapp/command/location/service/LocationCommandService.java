package com.partyapp.command.location.service;

import com.partyapp.command.location.dataAccess.ILocationCommandDA;
import com.partyapp.commons.dataAccess.query.location.LocationDAO;
import com.partyapp.commons.entities.location.LocalityDTO;
import com.partyapp.commons.entities.location.LocationDTO;
import com.partyapp.commons.mapper.CommandMapper;
import com.partyapp.query.locality.service.ILocalityQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class LocationCommandService implements ILocationCommandService {

    @Autowired
    private ILocationCommandDA locationCommandDA;

    @Autowired
    private CommandMapper commandMapper;

    @Autowired
    private ILocalityQueryService localityQueryService;

    @Override
    public void saveLocation(LocationDTO request) {
        if (request == null) {
            return;
        }
        // CHECK IF COUNTRY EXIST
        // SAVE COUNTRY IF NOT EXIST
        boolean existLocality = this.existLocality(request);
        // SAVE LOCALITY IF NOT EXIST

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

    private boolean existLocality(LocationDTO location) {
        boolean existLocality = false;
        if (location.getLocalityId() != null
                && location.getLocalityId() > 0
                && location.getCountryId() != null
                && location.getCountryId() > 0
        ) {
            existLocality = this.existLocalityById(location.getLocalityId(), location.getCountryId());
        }
        if (!existLocality
                && location.getLocalityName() != null
                && !location.getLocalityName().isEmpty()) {
            existLocality = this.existLocalityByName(location.getLocalityName());
        }
        return existLocality;
    }

    private boolean existLocalityById(Long id, Integer countryId) {
        boolean existLocality = false;
        try {
            LocalityDTO localityDTO = localityQueryService.getLocalityById(id, countryId);
            if (localityDTO != null) {
                existLocality = true;
            }
        } catch (ResponseStatusException e) {
            if (!HttpStatus.NOT_FOUND.equals(e.getStatus())) {
                throw e;
            }
        }
        return existLocality;
    }

    private boolean existLocalityByName (String name) {
        boolean existLocality = false;
        try {
            LocalityDTO localityDTO = localityQueryService.getLocalityByName(name);
            if (localityDTO != null) {
                existLocality = true;
            }
        } catch (ResponseStatusException e) {
            if (!HttpStatus.NOT_FOUND.equals(e.getStatus())) {
                throw e;
            }
        }
        return existLocality;
    }
}
