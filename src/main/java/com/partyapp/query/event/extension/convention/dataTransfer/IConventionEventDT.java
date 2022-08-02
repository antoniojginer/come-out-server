package com.partyapp.query.event.extension.convention.dataTransfer;

import com.partyapp.query.event.dataTransfer.IEventDTService;

public interface IConventionEventDT extends IEventDTService {
    @Override
    public ConventionEventDTO getEventDetail(Long id);
}
