package com.partyapp.query.user.particular.controller;

import com.partyapp.commons.entities.user.particular.ParticularUserDTO;
import com.partyapp.query.user.particular.service.IParticularUserQueryService;
import com.partyapp.query.user.particular.service.ParticularUserQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user/particular")
public class ParticularUserQueryController implements IParticularUserQueryController {

    @Autowired
    private IParticularUserQueryService particularUserQueryService;

    @Override
    @GetMapping("/{id}")
    public ParticularUserDTO getUser(@PathVariable("id") Long id) {
        return particularUserQueryService.getUser(id);
    }

    @Override
    @GetMapping("")
    public List<ParticularUserDTO> getAllUsers() {
        return particularUserQueryService.getAllUsers();
    }
}
