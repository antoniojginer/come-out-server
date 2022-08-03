package com.partyapp.query.event.extension.convention.service;

import com.partyapp.commons.mapper.DataAccessObjectToDataTransferObjectMapper;
import com.partyapp.query.event.extension.convention.dataAccess.ConventionEventDAO;
import com.partyapp.query.event.extension.convention.dataAccess.IConventionEventDA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ConventionEventService implements IConventionEventService {

    @Autowired
    private IConventionEventDA conventionEventDA;

    @Autowired
    private DataAccessObjectToDataTransferObjectMapper mapper;

    @Override
    public ConventionEventDTO getEventDetail(Long id) {
        ConventionEventDAO conventionEventDAO = conventionEventDA.getConventionEventDetail(id);
        return mapper.toConventionEventDto(conventionEventDAO);
    }

    @Override
    public List<ConventionEventDTO> getAllEvents() {
        List <ConventionEventDAO> conventionEventDAOList = conventionEventDA.getAllConventionEvents();
        List<ConventionEventDTO> res = conventionEventDAOList
                .stream()
                .map(event -> mapper.toConventionEventDto(event))
                .collect(Collectors.toList());
        return res;
    }
}
