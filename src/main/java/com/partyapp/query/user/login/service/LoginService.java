package com.partyapp.query.user.login.service;

import com.partyapp.commons.dataAccess.query.user.login.LoginDAO;
import com.partyapp.commons.entities.user.LoginDTO;
import com.partyapp.query.user.login.dataAccess.ILoginDA;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class LoginService implements ILoginService {

    @Autowired
    private ILoginDA loginDA;

    @Override
    public LoginDTO login(LoginDTO request) {
        LoginDAO loginDAO = loginDA.login(request);
        String loginRequestPassword = this.getPasswordEncoded(request.getPassword());
        if (!loginRequestPassword.equals(request.getPassword())) {
            throw new ResponseStatusException(
                    HttpStatus.UNAUTHORIZED,
                    "Password for email not valid"
            );
        }
        return new LoginDTO(loginDAO.getId(), loginDAO.getEmail(), "*********");
    }

    private String getPasswordEncoded(String password) {
        try {
            return DigestUtils.sha256Hex(password);
        } catch (RuntimeException e) {
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    "Error coding request password"
            );
        }
    }
}
