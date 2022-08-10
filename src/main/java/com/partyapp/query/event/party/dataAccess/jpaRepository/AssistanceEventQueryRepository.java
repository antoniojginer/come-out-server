package com.partyapp.query.event.party.dataAccess.jpaRepository;

import com.partyapp.commons.dataAccess.query.event.base.AssistanceEventCompositeKey;
import com.partyapp.commons.dataAccess.query.event.base.AssistanceEventDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AssistanceEventQueryRepository extends
        JpaRepository<AssistanceEventDAO, AssistanceEventCompositeKey> {

    @Query(
            value = "select count(*) from assistant where event_id=:eventId",
            nativeQuery = true
    )
    public Integer getEventAssistance(@Param("eventId") Long eventId);
}
