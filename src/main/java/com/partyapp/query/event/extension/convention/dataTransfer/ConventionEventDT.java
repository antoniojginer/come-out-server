package com.partyapp.query.event.extension.convention.dataTransfer;

import com.partyapp.query.event.IEventDTService;
import com.partyapp.query.event.extension.convention.dataAccess.ConventionEventDAO;
import com.partyapp.query.event.extension.convention.dataAccess.IConventionEventDA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConventionEventDT implements IConventionEventDT {

    @Autowired
    private IConventionEventDA conventionEventDA;

    @Override
    public ConventionEventDTO getEventDetail(Long id) {
        ConventionEventDAO conventionEventDAO = conventionEventDA.getConventionEventDetail(id);
        // MAPPER
        return new ConventionEventDTO();
    }
}
