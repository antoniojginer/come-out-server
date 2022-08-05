package com.partyapp.query.locality.dataAccess.jpaRepository;

import com.partyapp.commons.dataAccess.query.location.LocalityCompositeKey;
import com.partyapp.commons.dataAccess.query.location.LocalityDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface LocalityQueryRepository extends JpaRepository<LocalityDAO, LocalityCompositeKey> {
    @Query(
            value = "select * from locality where name=:localityName",
            nativeQuery = true
    )
    public LocalityDAO getLocalityByName(@Param("localityName") String name);
}
