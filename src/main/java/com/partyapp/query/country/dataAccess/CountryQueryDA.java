package com.partyapp.query.country.dataAccess;

import com.partyapp.commons.dataAccess.query.location.CountryDAO;
import com.partyapp.query.country.dataAccess.jpaRepository.CountryQueryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class CountryQueryDA implements ICountryQueryDA {

    @Autowired
    private CountryQueryRepository countryQueryRepository;

    @Override
    public CountryDAO getCountryBy(Integer id) {
        try {
            Optional<CountryDAO> country = countryQueryRepository.findById(id);
            if (!country.isEmpty()) {
                return country.get();
            }
        } catch (Exception e) {
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    "Error getting country by id"
            );
        }
        throw new ResponseStatusException(
                HttpStatus.NOT_FOUND,
                "Country query by id not found"
        );
    }

    @Override
    public CountryDAO getCountryByName(String name) {
        try {
            Optional<CountryDAO> country = countryQueryRepository.getCountryByName(name);
            if (!country.isEmpty()) {
                return country.get();
            }
        } catch (Exception e) {
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    "Error getting country by name"
            );
        }
        throw new ResponseStatusException(
                HttpStatus.NOT_FOUND,
                "Country query by name not found"
        );
    }

    @Override
    public List<CountryDAO> getAllCountries() {
        try {
            List<CountryDAO> countries = countryQueryRepository.findAll();
            if (!countries.isEmpty()) {
                return countries;
            }
        } catch (Exception e) {
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    "Error getting all countries"
            );
        }
        throw new ResponseStatusException(
                HttpStatus.NOT_FOUND,
                "Empty response in get all countries query"
        );
    }
}
