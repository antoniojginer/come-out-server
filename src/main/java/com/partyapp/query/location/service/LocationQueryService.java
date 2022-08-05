package com.partyapp.query.location.service;

import com.partyapp.commons.dataAccess.query.location.LocationDAO;
import com.partyapp.commons.entities.location.LocationDTO;
import com.partyapp.commons.mapper.QueryMapper;
import com.partyapp.query.location.dataAccess.ILocationQueryDA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LocationQueryService implements ILocationQueryService {

    @Autowired
    private ILocationQueryDA locationQueryDA;

    @Autowired
    private QueryMapper queryMapper;

    @Override
    public LocationDTO getLocationById(Long id) {
        LocationDAO locationDAO = locationQueryDA.getLocationById(id);
        return queryMapper.toLocationDto(locationDAO);
    }

    @Override
    public List<LocationDTO> getAllLocations() {
        List<LocationDAO> locationList = locationQueryDA.getAllLocations();
        return locationList.stream()
                .map(location -> queryMapper.toLocationDto(location))
                .collect(Collectors.toList());
    }
}
