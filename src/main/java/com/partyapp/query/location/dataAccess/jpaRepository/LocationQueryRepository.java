package com.partyapp.query.location.dataAccess.jpaRepository;

import com.partyapp.commons.dataAccess.query.location.LocationDAO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationQueryRepository extends JpaRepository<LocationDAO, Long> {
}
