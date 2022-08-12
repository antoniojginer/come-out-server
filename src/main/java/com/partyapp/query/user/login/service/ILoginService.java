package com.partyapp.query.user.login.service;

import com.partyapp.commons.entities.user.LoginDTO;

public interface ILoginService {
    public LoginDTO login(LoginDTO request);
}
