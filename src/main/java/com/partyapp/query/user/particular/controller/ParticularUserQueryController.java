package com.partyapp.query.user.particular.controller;

import com.partyapp.commons.entities.user.particular.ParticularUserDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user/particular")
public class ParticularUserQueryController implements IParticularUserQueryController {

    @Override
    @GetMapping("/{id}")
    public ParticularUserDTO getUser(@PathVariable("id") Long id) {
        // TODO
        return null;
    }

    @Override
    @GetMapping("")
    public List<ParticularUserDTO> getAllUsers() {
        // TODO
        return null;
    }
}
