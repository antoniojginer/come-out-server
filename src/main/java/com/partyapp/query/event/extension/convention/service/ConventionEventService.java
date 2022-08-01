package com.partyapp.query.event.extension.convention.service;

import com.partyapp.entities.event.convention.ConventionModel;
import com.partyapp.query.event.extension.convention.dataAccess.IConventionEventDA;
import com.partyapp.query.event.extension.convention.dataAccess.ConventionEventDAO;
import com.partyapp.query.event.extension.convention.dataTransfer.ConventionEventDTO;
import com.partyapp.query.event.extension.convention.dataTransfer.IConventionEventDT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ConventionEventService implements IConventionEventService {

    @Autowired
    private IConventionEventDT conventionEventDT;

    @Override
    public ConventionModel getEventDetail(Long id) {
        // TODO
        ConventionEventDTO conventionEventDTO = conventionEventDT.getEventDetail(id);
        // MAPPER
        return new ConventionModel();
    }
}
