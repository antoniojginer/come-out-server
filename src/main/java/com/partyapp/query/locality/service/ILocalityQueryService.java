package com.partyapp.query.locality.service;

import com.partyapp.commons.dataAccess.query.location.LocalityDAO;
import com.partyapp.commons.entities.location.LocalityDTO;

import java.util.List;

public interface ILocalityQueryService {
    public LocalityDTO getLocalityById(Long id);
    public LocalityDTO getLocalityByName(String name);
    public List<LocalityDTO> getAllLocalities();
}
