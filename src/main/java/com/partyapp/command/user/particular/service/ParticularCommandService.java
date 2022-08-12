package com.partyapp.command.user.particular.service;

import com.partyapp.command.user.particular.dataAccess.IParticularCommandDA;
import com.partyapp.commons.dataAccess.command.user.base.BaseUserCommandDAO;
import com.partyapp.commons.dataAccess.command.user.login.LoginCommandDAO;
import com.partyapp.commons.dataAccess.command.user.particular.ParticularUserCommandDAO;
import com.partyapp.commons.entities.user.particular.ParticularUserDTO;
import com.partyapp.commons.mapper.CommandMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ParticularCommandService implements IParticularCommandService {

    @Autowired
    private IParticularCommandDA particularCommandDA;

    @Autowired
    private CommandMapper commandMapper;

    @Override
    @Transactional
    public ParticularUserDTO createParticularUser(ParticularUserDTO request) {
        // Check location
        if (request.getLocation() != null && request.getLocation().getId() == null) {
            // Save location
        }
        // MAP baseUser
        BaseUserCommandDAO baseUserCommandDAO = commandMapper.toBaseUserCommandDAO(request);
        // SAVE baseUser
        // MAP login
        LoginCommandDAO loginCommandDAO = commandMapper.toLoginCommandDAO(request);
        // Save login
        ParticularUserCommandDAO particularUserCommandDAO = particularCommandDA.createParticularUser(
                commandMapper.toParticularUserCommandDAO(request)
        );
        return request;
    }
}
