package com.partyapp.commons.login.controller;

import com.partyapp.commons.entities.user.LoginDTO;

public interface ILoginController {
    public LoginDTO login(LoginDTO request);
}
