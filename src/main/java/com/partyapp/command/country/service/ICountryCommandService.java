package com.partyapp.command.country.service;

import com.partyapp.commons.entities.location.CountryDTO;

public interface ICountryCommandService {
    public CountryDTO saveCountry(CountryDTO request);
}
