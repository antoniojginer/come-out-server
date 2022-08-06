package com.partyapp.command.locality.service;

import com.partyapp.command.locality.dataAccess.ILocalityCommandDA;
import com.partyapp.commons.entities.location.LocalityDTO;
import com.partyapp.commons.mapper.CommandMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalityCommandService implements ILocalityCommandService {

    @Autowired
    private ILocalityCommandDA localityCommandDA;

    @Autowired
    private CommandMapper commandMapper;

    @Override
    public void saveLocality(LocalityDTO request) {
        localityCommandDA.saveLocality(commandMapper.toLocalityDTO(request));
    }
}
