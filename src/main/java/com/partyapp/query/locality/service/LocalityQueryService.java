package com.partyapp.query.locality.service;

import com.partyapp.commons.dataAccess.query.location.LocalityDAO;
import com.partyapp.commons.entities.location.LocalityDTO;
import com.partyapp.commons.mapper.QueryMapper;
import com.partyapp.query.locality.dataAccess.ILocalityQueryDA;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class LocalityQueryService implements ILocalityQueryService {

    @Autowired
    private ILocalityQueryDA localityQueryDA;

    @Autowired
    private QueryMapper queryMapper;

    @Override
    public LocalityDTO getLocalityById(Long id) {
        LocalityDAO localityDAO = localityQueryDA.getLocalityById(id);
        return queryMapper.toLocalityDto(localityDAO);
    }

    @Override
    public LocalityDTO getLocalityByName(String name) {
        LocalityDAO localityDAO = localityQueryDA.getLocalityByName(name);
        return queryMapper.toLocalityDto(localityDAO);
    }

    @Override
    public List<LocalityDTO> getAllLocalities() {
        List<LocalityDAO> localityList = localityQueryDA.getAllLocalities();
        return localityList.stream()
                .map(locality -> queryMapper.toLocalityDto(locality))
                .collect(Collectors.toList());
    }
}
