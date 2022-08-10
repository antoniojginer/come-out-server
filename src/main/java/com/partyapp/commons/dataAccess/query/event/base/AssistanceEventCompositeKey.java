package com.partyapp.commons.dataAccess.query.event.base;

import lombok.AllArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
public class AssistanceEventCompositeKey implements Serializable {
    public AssistanceEventCompositeKey() {
        this.userId = 0l;
        this.eventId = 0l;
    }

    private Long userId;
    private Long eventId;
}