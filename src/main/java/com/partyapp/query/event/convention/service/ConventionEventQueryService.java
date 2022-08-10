package com.partyapp.query.event.convention.service;

import com.partyapp.commons.mapper.QueryMapper;
import com.partyapp.commons.entities.event.convention.ConventionEventDTO;
import com.partyapp.query.event.convention.dataAccess.IConventionEventQueryDA;
import com.partyapp.commons.dataAccess.query.event.convention.ConventionEventDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ConventionEventQueryService implements IConventionEventQueryService {

    @Autowired
    private IConventionEventQueryDA conventionEventDA;

    @Autowired
    private QueryMapper mapper;

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

    @Override
    public Integer getEventAssistance(Long id) {
        return null;
    }
}
