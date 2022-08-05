package com.partyapp.query.locality.dataAccess;

import com.partyapp.commons.dataAccess.query.location.LocalityDAO;

import java.util.List;

public interface ILocalityQueryDA {
    public LocalityDAO getLocalityById(Long id, Integer countryId);
    public LocalityDAO getLocalityByName(String name);
    public List<LocalityDAO> getAllLocalities();
}
