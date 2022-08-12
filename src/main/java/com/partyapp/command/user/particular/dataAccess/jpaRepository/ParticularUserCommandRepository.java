package com.partyapp.command.user.particular.dataAccess.jpaRepository;

import com.partyapp.commons.dataAccess.command.user.particular.ParticularUserCommandDAO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticularUserCommandRepository extends JpaRepository<ParticularUserCommandDAO, Long> {
}
