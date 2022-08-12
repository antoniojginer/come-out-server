package com.partyapp.commons.login.dataAccess;

import com.partyapp.commons.dataAccess.query.user.login.LoginDAO;
import com.partyapp.commons.login.dataAccess.jpaRepository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class LoginDA implements ILoginDA {

    @Autowired
    private LoginRepository loginRepository;

    @Override
    public LoginDAO login(LoginDAO request) {
        try {
            LoginDAO loginDAO = loginRepository.getUserByEmail(request.getEmail());
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

    @Override
    public LoginDAO saveLogin(LoginDAO request) {
        try {
            LoginDAO loginDAO = loginRepository.save(request);
            if (loginDAO != null) {
                return loginDAO;
            }
        } catch (Exception e) {
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    "Error during save login request"
            );
        }
        throw new ResponseStatusException(
                HttpStatus.INTERNAL_SERVER_ERROR,
                "Error during save login request"
        );
    }
}
