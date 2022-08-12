package com.partyapp.query.user.login.dataAccess;

import com.partyapp.commons.dataAccess.query.user.login.LoginDAO;
import com.partyapp.commons.entities.user.LoginDTO;
import com.partyapp.query.user.login.dataAccess.jpaRepository.LoginQueryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class LoginDA implements ILoginDA {

    @Autowired
    private LoginQueryRepository baseUserQueryRepository;

    @Override
    public LoginDAO login(LoginDTO request) {
        try {
            LoginDAO loginDAO = baseUserQueryRepository.getBaseUserByEmail(request.getEmail());
            if (
                loginDAO != null
                && loginDAO.getPassword() != null
                && !loginDAO.getPassword().isEmpty()
            ) {
                return loginDAO;
            }
        } catch (Exception e) {
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    "Error during login request"
            );
        }
        throw new ResponseStatusException(
                HttpStatus.NOT_FOUND,
                "User not found in login request"
        );
    }
}
