package com.partyapp.commons.login.dataAccess.jpaRepository;

import com.partyapp.commons.dataAccess.query.user.login.LoginDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface LoginRepository extends JpaRepository<LoginDAO, Long> {
    @Query(value = "select * from login where email=:email", nativeQuery = true)
    public LoginDAO getUserByEmail(@Param("email") String email);
}
