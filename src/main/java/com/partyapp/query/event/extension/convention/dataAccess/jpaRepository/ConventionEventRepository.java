package com.partyapp.query.event.extension.convention.dataAccess.jpaRepository;

import com.partyapp.query.event.extension.convention.dataAccess.ConventionEventDAO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConventionEventRepository extends JpaRepository<ConventionEventDAO, Long> {
}
