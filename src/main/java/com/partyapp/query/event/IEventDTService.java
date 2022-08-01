package com.partyapp.query.event;

import com.partyapp.query.event.dto.BaseEventDTO;

public interface IEventDTService<T extends BaseEventDTO> {
    public BaseEventDTO getEventDetail(Long id);
}
