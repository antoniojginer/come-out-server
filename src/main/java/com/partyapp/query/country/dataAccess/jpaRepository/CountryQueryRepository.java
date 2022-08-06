package com.partyapp.query.country.dataAccess.jpaRepository;

import com.partyapp.commons.dataAccess.query.location.CountryDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface CountryQueryRepository extends JpaRepository<CountryDAO, Integer> {
    @Query(
            value = "select * from country where name=:countryName",
            nativeQuery = true
    )
    public Optional<CountryDAO> getCountryByName(@Param("countryName") String name);
}
