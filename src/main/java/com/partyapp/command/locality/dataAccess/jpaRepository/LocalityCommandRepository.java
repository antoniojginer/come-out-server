package com.partyapp.command.locality.dataAccess.jpaRepository;

import com.partyapp.command.locality.dataAccess.LocalityCommandDA;
import com.partyapp.commons.dataAccess.command.locality.LocalityCommandDAO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocalityCommandRepository extends JpaRepository<LocalityCommandDAO, Long> {
}
