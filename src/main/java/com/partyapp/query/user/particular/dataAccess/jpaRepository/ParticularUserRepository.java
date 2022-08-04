package com.partyapp.query.user.particular.dataAccess.jpaRepository;

import com.partyapp.commons.dataAccess.query.user.particular.ParticularUserDAO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticularUserRepository extends JpaRepository<ParticularUserDAO, Long> {
}
