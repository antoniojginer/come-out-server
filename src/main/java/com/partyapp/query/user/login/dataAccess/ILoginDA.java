package com.partyapp.query.user.login.dataAccess;

import com.partyapp.commons.dataAccess.query.user.login.LoginDAO;
import com.partyapp.commons.entities.user.LoginDTO;

public interface ILoginDA {
    public LoginDAO login(LoginDTO request);
}
