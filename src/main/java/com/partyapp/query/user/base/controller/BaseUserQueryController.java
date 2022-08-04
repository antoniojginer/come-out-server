package com.partyapp.query.user.base.controller;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.partyapp.commons.entities.user.base.BaseUserDTO;
import com.partyapp.query.user.base.service.IBaseUserQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class BaseUserQueryController implements IBaseUserQueryController {

    @Autowired
    private IBaseUserQueryService baseUserQueryService;

    @Override
    @GetMapping("/{id}")
    public BaseUserDTO getUser(@PathVariable("id") Long id) {
        return baseUserQueryService.getUser(id);
    }

    @Override
    @GetMapping("")
    public List<BaseUserDTO> getAllUsers() {
        // TODO
        return null;
    }
}
