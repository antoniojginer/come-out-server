package com.partyapp.command.user.base.dataAccess.jpaRepository;

import com.partyapp.commons.dataAccess.command.user.base.BaseUserCommandDAO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseUserCommandRepository extends JpaRepository<BaseUserCommandDAO, Long> {

}
