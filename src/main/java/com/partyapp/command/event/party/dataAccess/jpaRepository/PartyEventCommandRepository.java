package com.partyapp.command.event.party.dataAccess.jpaRepository;

import com.partyapp.commons.dataAccess.event.party.PartyEventDAO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyEventCommandRepository extends JpaRepository<PartyEventDAO, Long> {
}
