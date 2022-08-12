package com.partyapp.command.user.particular.service;

import com.partyapp.command.user.base.service.IBaseUserCommandService;
import com.partyapp.command.user.particular.dataAccess.IParticularCommandDA;
import com.partyapp.commons.dataAccess.command.user.base.BaseUserCommandDAO;
import com.partyapp.commons.dataAccess.command.user.particular.ParticularUserCommandDAO;
import com.partyapp.commons.entities.user.base.BaseUserDTO;
import com.partyapp.commons.entities.user.particular.ParticularUserDTO;
import com.partyapp.commons.login.service.ILoginService;
import com.partyapp.commons.mapper.CommandMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ParticularCommandService implements IParticularCommandService {

    @Autowired
    private IParticularCommandDA particularCommandDA;

    @Autowired
    private IBaseUserCommandService baseUserCommandService;

    @Autowired
    private ILoginService loginService;

    @Autowired
    private CommandMapper commandMapper;

    @Override
    @Transactional
    public ParticularUserDTO createParticularUser(ParticularUserDTO request) {
        // Check location
        if (request.getLocation() != null && request.getLocation().getId() == null) {
            // Save location
        }
        BaseUserDTO baseUserDTO = baseUserCommandService.saveBaseUser(
                commandMapper.toBaseUserCommandDTO(request)
        );
        request.setId(baseUserDTO.getId());
        loginService.saveLogin(commandMapper.toLoginDTO(request));
        ParticularUserCommandDAO particularUserCommandDAO = particularCommandDA.createParticularUser(
                commandMapper.toParticularUserCommandDAO(request)
        );
        return request;
    }
}
