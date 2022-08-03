package com.partyapp.query.event.extension.convention.dataAccess;

import com.partyapp.commons.exceptions.BackendException;
import com.partyapp.commons.exceptions.BackendExceptionCode;
import com.partyapp.query.event.extension.convention.dataAccess.jpaRepository.ConventionEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class ConventionEventDA implements IConventionEventDA {
    @Autowired ConventionEventRepository conventionEventRepository;

    @Override
    public ConventionEventDAO getConventionEventDetail(Long id) {
        try {
            Optional<ConventionEventDAO> conventionEventDAO = conventionEventRepository.findById(id);
            if (!conventionEventDAO.isEmpty()) {
                return conventionEventDAO.get();
            }
        } catch (Exception e) {
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    "Error getting a convention event"
            );
        }
        throw new ResponseStatusException(
                HttpStatus.NOT_FOUND,
                "Convention event detail not found"
        );
    }

    @Override
    public List<ConventionEventDAO> getAllConventionEvents() {
        try {
            List<ConventionEventDAO> allConventionEvents = conventionEventRepository.findAll();
            if (!allConventionEvents.isEmpty()) {
                return allConventionEvents;
            }
        } catch (Exception e) {
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    "Error getting all convention events"
            );
        }
        throw new ResponseStatusException(
                HttpStatus.NOT_FOUND,
                "No convention events found"
        );
    }

}
