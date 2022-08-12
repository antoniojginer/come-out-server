package com.partyapp.commons.login.dataAccess;

import com.partyapp.commons.dataAccess.query.user.login.LoginDAO;
import com.partyapp.commons.entities.user.LoginDTO;

public interface ILoginDA {
    public LoginDAO login(LoginDAO request);
    public LoginDAO saveLogin(LoginDAO request);
}
