package com.partyapp.command.user.particular.controller;

import com.partyapp.commons.entities.user.particular.ParticularUserDTO;

public interface IParticularCommandController {
    public ParticularUserDTO createParticularUser(ParticularUserDTO request);
}
