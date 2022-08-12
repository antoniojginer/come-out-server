package com.partyapp.commons.login.controller;

import com.partyapp.commons.entities.user.LoginDTO;
import com.partyapp.commons.login.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController implements ILoginController{

    @Autowired
    private ILoginService loginService;

    @Override
    @PostMapping("")
    public LoginDTO login(@RequestBody LoginDTO request) {
        return loginService.login(request);
    }
}
