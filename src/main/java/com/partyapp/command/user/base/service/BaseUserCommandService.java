package com.partyapp.command.user.base.service;

import com.partyapp.command.user.base.dataAccess.IBaseUserCommandDA;
import com.partyapp.commons.dataAccess.command.user.base.BaseUserCommandDAO;
import com.partyapp.commons.entities.user.base.BaseUserDTO;
import com.partyapp.commons.mapper.CommandMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaseUserCommandService implements IBaseUserCommandService {

    @Autowired
    private IBaseUserCommandDA baseUserCommandDA;

    @Autowired
    private CommandMapper commandMapper;

    @Override
    public BaseUserDTO saveBaseUser(BaseUserDTO request) {
        BaseUserCommandDAO baseUserCommandDAO = baseUserCommandDA.saveBaseUser(
                commandMapper.toBaseUserCommandDAO(request)
        );
        request.setId(baseUserCommandDAO.getId());
        return request;
    }
}
