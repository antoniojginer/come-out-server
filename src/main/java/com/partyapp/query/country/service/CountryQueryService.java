package com.partyapp.query.country.service;

import com.partyapp.commons.dataAccess.query.location.CountryDAO;
import com.partyapp.commons.entities.location.CountryDTO;
import com.partyapp.commons.mapper.QueryMapper;
import com.partyapp.query.country.dataAccess.ICountryQueryDA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CountryQueryService implements ICountryQueryService {

    @Autowired
    private ICountryQueryDA countryQueryDA;

    @Autowired
    private QueryMapper queryMapper;

    @Override
    public CountryDTO getCountryById(Integer id) {
        CountryDAO countryDAO = countryQueryDA.getCountryBy(id);
        return queryMapper.toCountryDto(countryDAO);
    }

    @Override
    public CountryDTO getCountryByName(String name) {
        CountryDAO countryDAO = countryQueryDA.getCountryByName(name);
        return queryMapper.toCountryDto(countryDAO);
    }

    @Override
    public List<CountryDTO> getAllCountries() {
        List<CountryDAO> countryDAO = countryQueryDA.getAllCountries();
        return countryDAO.stream()
                .map(country -> queryMapper.toCountryDto(country))
                .collect(Collectors.toList());
    }
}
