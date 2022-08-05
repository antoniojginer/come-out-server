package com.partyapp.query.locality.dataAccess.jpaRepository;

import com.partyapp.commons.dataAccess.query.location.LocalityDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface LocalityQueryRepository extends JpaRepository<LocalityDAO, Long> {
    @Query("from locality where name = :name")
    public LocalityDAO getLocalityByName(String name);
}
