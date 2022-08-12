package com.partyapp.command.user.particular.controller;

import com.partyapp.command.user.particular.service.IParticularCommandService;
import com.partyapp.commons.entities.user.particular.ParticularUserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user/particular")
public class ParticularCommandController implements IParticularCommandController {

    @Autowired
    private IParticularCommandService particularCommandService;

    @Override
    @PutMapping("")
    public ParticularUserDTO createParticularUser(@RequestBody ParticularUserDTO request) {
        return particularCommandService.createParticularUser(request);
    }
}
