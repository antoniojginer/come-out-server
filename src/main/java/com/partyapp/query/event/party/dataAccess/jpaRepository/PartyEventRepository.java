package com.partyapp.query.event.party.dataAccess.jpaRepository;

import com.partyapp.query.event.party.dataAccess.PartyEventDAO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyEventRepository extends JpaRepository<PartyEventDAO, Long> {
}
