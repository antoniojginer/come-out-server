package com.partyapp.command.country.dataAccess.jpaRepository;

import com.partyapp.commons.dataAccess.command.country.CountryCommandDAO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryCommandRepository extends JpaRepository<CountryCommandDAO, Integer> {
}
