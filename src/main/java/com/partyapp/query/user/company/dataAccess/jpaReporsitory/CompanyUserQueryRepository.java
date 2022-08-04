package com.partyapp.query.user.company.dataAccess.jpaReporsitory;

import com.partyapp.commons.dataAccess.query.user.company.CompanyUserDAO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyUserQueryRepository extends JpaRepository<CompanyUserDAO, Long> {
}
