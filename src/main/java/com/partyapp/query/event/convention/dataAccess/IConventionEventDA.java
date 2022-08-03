package com.partyapp.query.event.convention.dataAccess;

import java.util.List;

public interface IConventionEventDA {
    public ConventionEventDAO getConventionEventDetail(Long id);
    public List<ConventionEventDAO> getAllConventionEvents();
}
