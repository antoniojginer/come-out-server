package com.partyapp.query.user.base.dataAccess.jpaRepository;

import com.partyapp.commons.dataAccess.query.user.base.BaseUserDAO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseUserQueryRepository extends JpaRepository<BaseUserDAO, Long> {
}
