package com.partyapp.query.user.particular.service;

import com.partyapp.commons.dataAccess.query.user.particular.ParticularUserDAO;
import com.partyapp.commons.entities.user.particular.ParticularUserDTO;
import com.partyapp.commons.mapper.QueryMapper;
import com.partyapp.query.user.particular.dataAccess.IParticularUserQueryDA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ParticularUserQueryService implements IParticularUserQueryService {

    @Autowired
    private IParticularUserQueryDA particularUserQueryDA;

    @Autowired
    private QueryMapper queryMapper;


    @Override
    public ParticularUserDTO getUser(Long id) {
        ParticularUserDAO particularUserDAO = particularUserQueryDA.getUser(id);
        return queryMapper.toParticularUserDetailDto(particularUserDAO);
    }

    @Override
    public List<ParticularUserDTO> getAllUsers() {
        List<ParticularUserDAO> particularUsers = particularUserQueryDA.getAllUsers();
        return particularUsers.stream()
                .map(user -> queryMapper.toParticularUserDetailDto(user))
                .collect(Collectors.toList());
    }
}
