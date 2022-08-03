package com.partyapp.query.event.convention.dataAccess;

import com.partyapp.commons.dataAccess.event.convention.ConventionEventDAO;

import java.util.List;

public interface IConventionEventQueryDA {
    public ConventionEventDAO getConventionEventDetail(Long id);
    public List<ConventionEventDAO> getAllConventionEvents();
}
