package com.partyapp.command.event.base.dataAccess.jpaRepository;

import com.partyapp.commons.dataAccess.command.event.base.BaseEventCommandDAO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseEventCommandRepository extends JpaRepository<BaseEventCommandDAO, Long> {
}
