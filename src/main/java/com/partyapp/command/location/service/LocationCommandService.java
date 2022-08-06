package com.partyapp.command.location.service;

import com.partyapp.command.country.service.ICountryCommandService;
import com.partyapp.command.locality.service.ILocalityCommandService;
import com.partyapp.command.location.dataAccess.ILocationCommandDA;
import com.partyapp.commons.dataAccess.command.location.LocationCommandDAO;
import com.partyapp.commons.entities.location.CountryDTO;
import com.partyapp.commons.entities.location.LocalityDTO;
import com.partyapp.commons.entities.location.LocationDTO;
import com.partyapp.commons.mapper.CommandMapper;
import com.partyapp.query.country.service.ICountryQueryService;
import com.partyapp.query.locality.service.ILocalityQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

@Service
public class LocationCommandService implements ILocationCommandService {

    @Autowired
    private ILocationCommandDA locationCommandDA;

    @Autowired
    private CommandMapper commandMapper;

    @Autowired
    private ILocalityQueryService localityQueryService;

    @Autowired
    private ILocalityCommandService localityCommandService;

    @Autowired
    private ICountryQueryService countryQueryService;

    @Autowired
    private ICountryCommandService countryCommandService;

    @Override
    @Transactional
    public void saveLocation(LocationDTO request) {
        if (request == null) {
            return;
        }
        this.checkSaveLocationRequest(request);
        LocationCommandDAO locationCommandDAO = commandMapper.toLocationDAO(request);
        locationCommandDA.saveLocation(locationCommandDAO);
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

    private void checkSaveLocationRequest(LocationDTO request) {
        this.checkCountryInfo(request);
        if (request.getCountryId() == null || request.getCountryId() < 1) {
            CountryDTO countrySaved = this.saveCountry(request);
            request.setCountryId(countrySaved.getId());
            request.setCountryName(countrySaved.getName());
        }

        this.checkLocalityInfo(request);
        if (!this.checkValidLocalityIds(request)) {
            LocalityDTO localitySaved = this.saveLocality(request);
            request.setLocalityId(localitySaved.getId());
            request.setLocalityName(localitySaved.getName());
        }
    }

    private void checkCountryInfo(LocationDTO request) {
        if (!this.existCountryById(request)) {
            CountryDTO country = this.getCountryByName(request);
            if (country != null && country.getId() > 0) {
                request.setCountryId(country.getId());
            }
        }
    }

    private boolean existCountryById(LocationDTO location) {
        if (location.getCountryId() == null) {
            return false;
        }
        boolean existCountry = false;
        try {
            CountryDTO country = countryQueryService.getCountryById(location.getCountryId());
            if (country != null) {
                existCountry = true;
            }
        } catch (ResponseStatusException e) {
            if (!HttpStatus.NOT_FOUND.equals(e.getStatus())) {
                throw e;
            }
        }
        return existCountry;
    }

    private CountryDTO getCountryByName(LocationDTO location) {
        CountryDTO res = new CountryDTO();
        if (location.getCountryName() != null) {
            try {
                CountryDTO country = countryQueryService.getCountryByName(location.getCountryName());
                if (country != null) {
                    res = country;
                }
            } catch (ResponseStatusException e) {
                if (!HttpStatus.NOT_FOUND.equals(e.getStatus())) {
                    throw e;
                }
            }
        }
        return res;
    }

    private CountryDTO saveCountry(LocationDTO request) {
        return countryCommandService.saveCountry(commandMapper.toCountryDTO(request));
    }

    private void checkLocalityInfo(LocationDTO request) {
        if (!this.existLocalityById(request)
                && request.getLocalityName() != null
                && !request.getLocalityName().isEmpty()) {
            LocalityDTO localityDTO = this.getLocalityByName(request.getLocalityName());
            if (this.checkValidLocalityIds(localityDTO)) {
                request.setLocalityId(localityDTO.getId());
                request.setCountryId(localityDTO.getCountryId());
            }
        }
    }

    private boolean existLocalityById(LocationDTO request) {
        if (!this.checkValidLocalityIds(request)) {
            return false;
        }
        boolean existLocality = false;
        try {
            LocalityDTO localityDTO = localityQueryService
                            .getLocalityById(request.getLocalityId(), request.getCountryId());
            if (localityDTO != null) {
                if (!localityDTO.getName().equals(request.getLocalityName())) {
                    request.setLocalityName(localityDTO.getName());
                }
                existLocality = true;
            }
        } catch (ResponseStatusException e) {
            if (!HttpStatus.NOT_FOUND.equals(e.getStatus())) {
                throw e;
            }
        }
        return existLocality;
    }

    private LocalityDTO getLocalityByName (String name) {
        LocalityDTO localityDTO = new LocalityDTO();
        try {
            localityDTO = localityQueryService.getLocalityByName(name);
            if (localityDTO != null) {
                return localityDTO;
            }
        } catch (ResponseStatusException e) {
            if (!HttpStatus.NOT_FOUND.equals(e.getStatus())) {
                throw e;
            }
        }
        return localityDTO;
    }

    private LocalityDTO saveLocality(LocationDTO request) {
        return localityCommandService.saveLocality(commandMapper.toLocalityDTO(request));
    }

    private boolean checkValidLocalityIds(LocationDTO location) {
        return location.getLocalityId() != null
                && location.getLocalityId() > 0
                && location.getCountryId() != null
                && location.getCountryId() > 0;
    }
    private boolean checkValidLocalityIds(LocalityDTO locality) {
        return locality.getId() != null
                && locality.getId() > 0
                && locality.getCountryId() != null
                && locality.getCountryId() > 0;
    }


}
