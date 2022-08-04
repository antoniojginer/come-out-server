package com.partyapp.query.event.party.dataAccess.jpaRepository;

import com.partyapp.commons.dataAccess.query.event.party.PartyEventDAO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyEventQueryRepository extends JpaRepository<PartyEventDAO, Long> {
}
