package com.partyapp.query.event.convention.dataAccess;

import com.partyapp.commons.dataAccess.query.event.convention.ConventionEventDAO;
import com.partyapp.query.event.convention.dataAccess.jpaRepository.ConventionEventQueryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class ConventionEventQueryDA implements IConventionEventQueryDA {
    @Autowired ConventionEventQueryRepository conventionEventRepository;

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
