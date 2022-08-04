package com.partyapp.query.event.convention.dataAccess.jpaRepository;

import com.partyapp.commons.dataAccess.query.event.convention.ConventionEventDAO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConventionEventQueryRepository extends JpaRepository<ConventionEventDAO, Long> {
}
