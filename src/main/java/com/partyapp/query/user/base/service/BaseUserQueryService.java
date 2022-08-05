package com.partyapp.query.user.base.service;

import com.partyapp.commons.dataAccess.query.user.base.BaseUserDAO;
import com.partyapp.commons.entities.user.base.BaseUserDTO;
import com.partyapp.commons.mapper.QueryMapper;
import com.partyapp.query.user.base.dataAccess.IBaseUserQueryDA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaseUserQueryService implements IBaseUserQueryService {

    @Autowired
    private IBaseUserQueryDA baseUserQueryDA;

    @Autowired
    private QueryMapper queryMapper;


    @Override
    public BaseUserDTO getUser(Long id) {
        BaseUserDAO baseUserDAO = baseUserQueryDA.getUser(id);
        return queryMapper.toBaseUserDto(baseUserDAO);
    }

    @Override
    public List getAllUsers() {
        // TODO
        return null;
    }
}
