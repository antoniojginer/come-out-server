package com.partyapp.query.event.extension.convention.dataAccess;

import com.partyapp.query.event.extension.convention.dataAccess.jpaRepository.ConventionEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConventionEventDA implements IConventionEventDA {
    @Autowired ConventionEventRepository conventionEventRepository;

    @Override
    public ConventionEventDAO getConventionEventDetail(Long id) {
        Optional<ConventionEventDAO> conventionEventDAO = conventionEventRepository.findById(id);
        if (conventionEventDAO.get() == null) throw new RuntimeException();
        return conventionEventDAO.get();
    }

}
