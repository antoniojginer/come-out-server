package com.partyapp.query.user.login.dataAccess.jpaRepository;

import com.partyapp.commons.dataAccess.query.user.base.BaseUserDAO;
import com.partyapp.commons.dataAccess.query.user.login.LoginDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface LoginQueryRepository extends JpaRepository<LoginDAO, Long> {
    @Query(value = "select * from app_user where email=:email", nativeQuery = true)
    public LoginDAO getBaseUserByEmail(@Param("email") String email);
}
