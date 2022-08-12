package com.partyapp.commons.login.service;

import com.partyapp.commons.dataAccess.query.user.login.LoginDAO;
import com.partyapp.commons.entities.user.LoginDTO;
import com.partyapp.commons.login.dataAccess.ILoginDA;
import com.partyapp.commons.mapper.CommandMapper;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class LoginService implements ILoginService {

    @Autowired
    private ILoginDA loginDA;

    @Autowired
    private CommandMapper commandMapper;

    @Override
    public LoginDTO login(LoginDTO request) {
        LoginDAO loginDAO = loginDA.login(commandMapper.toLoginDAO(request));
        String loginRequestPassword = this.getPasswordEncoded(request.getPassword());
        if (!loginRequestPassword.equals(loginDAO.getPassword())) {
            throw new ResponseStatusException(
                    HttpStatus.UNAUTHORIZED,
                    "Password for email not valid"
            );
        }
        return commandMapper.toLoginDTO(loginDAO);
    }

    @Override
    public LoginDTO saveLogin(LoginDTO request) {
        request.setPassword(this.getPasswordEncoded(request.getPassword()));
        LoginDAO loginDAO = loginDA.saveLogin(commandMapper.toLoginDAO(request));
        return commandMapper.toLoginDTO(loginDAO);
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
