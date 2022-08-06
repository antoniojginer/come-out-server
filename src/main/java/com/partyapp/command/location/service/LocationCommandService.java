package com.partyapp.command.location.service;

import com.partyapp.command.locality.service.ILocalityCommandService;
import com.partyapp.command.location.dataAccess.ILocationCommandDA;
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

    @Override
    @Transactional
    public void saveLocation(LocationDTO request) {
        if (request == null) {
            return;
        }
        // CHECK IF COUNTRY EXIST
        this.checkCountryInfo(request);
        if (request.getCountryId() == null || request.getCountryId() < 1) {
            // SAVE COUNTRY IF NOT EXIST

        }
        this.checkLocalityInfo(request);
        if (!this.checkValidLocalityIds(request)) {
            LocalityDTO localityDTO = commandMapper.toLocalityDTO(request);
            localityCommandService.saveLocality(localityDTO);
            request.setLocalityId(localityDTO.getId());
            request.setLocalityName(localityDTO.getName());
        }

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

    private void checkCountryInfo(LocationDTO request) {
        if (!this.existCountryById(request)) {
            CountryDTO country = this.getCountryByName(request);
            if (country != null && country.getId() > 0) {
                request.setCountryId(country.getId());
            }
        }
    }

    private boolean existCountryById(LocationDTO location) {
        boolean existCountry = false;
        if (location.getCountryId() != null) {
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
        boolean existLocality = false;
        if (this.checkValidLocalityIds(request)) {
            try {
                LocalityDTO localityDTO = localityQueryService
                                .getLocalityById(request.getLocalityId(), request.getCountryId());
                if (localityDTO != null) {
                    existLocality = true;
                }
            } catch (ResponseStatusException e) {
                if (!HttpStatus.NOT_FOUND.equals(e.getStatus())) {
                    throw e;
                }
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
