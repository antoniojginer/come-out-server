package com.partyapp.command.event.base.dataAccess;

import com.partyapp.commons.dataAccess.command.event.base.BaseEventCommandDAO;

public interface IBaseEventCommandDA {
    public BaseEventCommandDAO createBaseEvent(BaseEventCommandDAO event);
    public BaseEventCommandDAO modifyBaseEvent(BaseEventCommandDAO event, Long id);
}
