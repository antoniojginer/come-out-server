package com.partyapp.command.country.service;

import com.partyapp.command.country.dataAccess.ICountryCommandDA;
import com.partyapp.commons.dataAccess.command.country.CountryCommandDAO;
import com.partyapp.commons.entities.location.CountryDTO;
import com.partyapp.commons.mapper.CommandMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryCommandService implements ICountryCommandService {

    @Autowired
    private ICountryCommandDA countryCommandDA;

    @Autowired
    private CommandMapper commandMapper;

    @Override
    public CountryDTO saveCountry(CountryDTO request) {
        CountryCommandDAO countryCommandDAO = countryCommandDA.saveCountry(
                commandMapper.toCountryDAO(request)
        );
        return commandMapper.toCountryDTO(countryCommandDAO);
    }
}
