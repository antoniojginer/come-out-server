package com.partyapp.command.user.particular.service;

import com.partyapp.commons.entities.user.particular.ParticularUserDTO;

public interface IParticularCommandService {
    public ParticularUserDTO createParticularUser(ParticularUserDTO request);
}
