package com.partyapp.query.event.controller;

import com.partyapp.query.event.service.BaseEventDTO;

public interface IEventController <T extends BaseEventDTO> {

    public BaseEventDTO getEventDetail(Long id);
}
