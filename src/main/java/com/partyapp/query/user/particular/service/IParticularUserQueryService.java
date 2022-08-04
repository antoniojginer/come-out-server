package com.partyapp.query.user.particular.service;

import com.partyapp.commons.entities.user.particular.ParticularUserDTO;
import com.partyapp.query.user.base.service.IBaseUserQueryService;

import java.util.List;

public interface IParticularUserQueryService extends IBaseUserQueryService <ParticularUserDTO> {
    @Override
    public ParticularUserDTO getUser(Long id);

    @Override
    public List<ParticularUserDTO> getAllUsers();
}
