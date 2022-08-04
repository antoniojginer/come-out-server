package com.partyapp.command.event.base.dataAccess;

import com.partyapp.command.event.base.dataAccess.jpaRepository.BaseEventCommandRepository;
import com.partyapp.commons.dataAccess.command.event.base.BaseEventCommandDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaseEventCommandDA implements IBaseEventCommandDA {

    @Autowired
    private BaseEventCommandRepository repository;

    @Override
    public BaseEventCommandDAO createBaseEvent(BaseEventCommandDAO event) {
        BaseEventCommandDAO baseEventDAO = repository.save(event);
        return baseEventDAO;
    }

    @Override
    public BaseEventCommandDAO modifyBaseEvent(BaseEventCommandDAO event, Long id) {
        return null;
    }
}
