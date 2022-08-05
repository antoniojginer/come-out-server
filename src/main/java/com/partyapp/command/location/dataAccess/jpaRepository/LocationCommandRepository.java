package com.partyapp.command.location.dataAccess.jpaRepository;

import com.partyapp.commons.dataAccess.command.location.LocationCommandDAO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationCommandRepository extends JpaRepository<LocationCommandDAO, Long> {
}
