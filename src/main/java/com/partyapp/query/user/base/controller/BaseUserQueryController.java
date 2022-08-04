package com.partyapp.query.user.base.controller;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.partyapp.commons.entities.user.base.BaseUserDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class BaseUserQueryController implements IBaseUserQueryController {
    
    @Override
    @GetMapping("/{id}")
    public BaseUserDTO getUser(@PathVariable("id") Long id) {
        // TODO
        return null;
    }

    @Override
    @GetMapping("")
    public List<BaseUserDTO> getAllUsers() {
        // TODO
        return null;
    }
}
