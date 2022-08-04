package com.partyapp.command.event.party.dataAccess.jpaRepository;

import com.partyapp.commons.dataAccess.command.event.party.PartyEventCommandDAO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyEventCommandRepository extends JpaRepository<PartyEventCommandDAO, Long> {
}
