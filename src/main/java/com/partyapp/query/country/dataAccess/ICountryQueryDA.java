package com.partyapp.query.country.dataAccess;

import com.partyapp.commons.dataAccess.query.location.CountryDAO;

import java.util.List;

public interface ICountryQueryDA {
    public CountryDAO getCountryBy(Integer id);
    public CountryDAO getCountryByName(String name);
    public List<CountryDAO> getAllCountries();
}
