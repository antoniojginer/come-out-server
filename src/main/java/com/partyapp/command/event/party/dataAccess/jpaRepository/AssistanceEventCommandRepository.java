package com.partyapp.command.event.party.dataAccess.jpaRepository;

import com.partyapp.commons.dataAccess.command.event.base.AssistantEventCommandDAO;
import com.partyapp.commons.dataAccess.query.event.base.AssistanceEventCompositeKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssistanceEventCommandRepository extends
        JpaRepository<AssistantEventCommandDAO, AssistanceEventCompositeKey> {
}
