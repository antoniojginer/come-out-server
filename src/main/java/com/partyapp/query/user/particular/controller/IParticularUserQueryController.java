package com.partyapp.query.user.particular.controller;

import com.partyapp.commons.entities.user.particular.ParticularUserDTO;
import com.partyapp.query.user.base.controller.IBaseUserQueryController;

import java.util.List;

public interface IParticularUserQueryController extends IBaseUserQueryController <ParticularUserDTO> {
    @Override
    public ParticularUserDTO getUser(Long id);

    @Override
    public List<ParticularUserDTO> getAllUsers();
}
