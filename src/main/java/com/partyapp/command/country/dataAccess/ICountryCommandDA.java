package com.partyapp.command.country.dataAccess;

import com.partyapp.commons.dataAccess.command.country.CountryCommandDAO;

public interface ICountryCommandDA {
    public CountryCommandDAO saveCountry(CountryCommandDAO request);
}
