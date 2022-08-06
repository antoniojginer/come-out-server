package com.partyapp.command.country.dataAccess;

import com.partyapp.command.country.dataAccess.jpaRepository.CountryCommandRepository;
import com.partyapp.commons.dataAccess.command.country.CountryCommandDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class CountryCommandDA implements ICountryCommandDA {

    @Autowired
    private CountryCommandRepository countryCommandRepository;

    @Override
    public CountryCommandDAO saveCountry(CountryCommandDAO request) {
        try {
            CountryCommandDAO countryCommandDAO = countryCommandRepository.save(request);
            if (countryCommandDAO != null) {
                return countryCommandDAO;
            }
        } catch (Exception e) {
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    "Error saving country"
            );
        }
        throw new ResponseStatusException(
                HttpStatus.INTERNAL_SERVER_ERROR,
                "Empty response saving country"
        );
    }
}
