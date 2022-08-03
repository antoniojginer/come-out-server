package com.partyapp.query.event.convention.service;

import com.partyapp.commons.mapper.DataAccessObjectToDataTransferObjectMapper;
import com.partyapp.query.event.convention.dataAccess.IConventionEventDA;
import com.partyapp.query.event.convention.dataAccess.ConventionEventDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        return mapper.toConventionEventDetailDto(conventionEventDAO);
    }

    @Override
    public List<ConventionEventDTO> getAllEvents() {
        List <ConventionEventDAO> conventionEventDAOList = conventionEventDA.getAllConventionEvents();
        List<ConventionEventDTO> res = conventionEventDAOList
                .stream()
                .map(event -> mapper.toConventionEventDetailDto(event))
                .collect(Collectors.toList());
        return res;
    }
}
