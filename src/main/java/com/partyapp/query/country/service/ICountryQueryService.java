package com.partyapp.query.country.service;

import com.partyapp.commons.entities.location.CountryDTO;

import java.util.List;

public interface ICountryQueryService {
    public CountryDTO getCountryById(Integer id);
    public CountryDTO getCountryByName(String name);
    public List<CountryDTO> getAllCountries();
}
