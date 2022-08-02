package com.partyapp.query.event.dataTransfer;

public interface IEventDTService<T extends BaseEventDTO> {
    public BaseEventDTO getEventDetail(Long id);
}
