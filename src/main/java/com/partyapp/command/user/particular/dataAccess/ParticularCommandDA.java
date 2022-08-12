package com.partyapp.command.user.particular.dataAccess;

import com.partyapp.command.user.particular.dataAccess.jpaRepository.ParticularUserCommandRepository;
import com.partyapp.commons.dataAccess.command.user.particular.ParticularUserCommandDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class ParticularCommandDA implements IParticularCommandDA {

    @Autowired
    private ParticularUserCommandRepository particularUserCommandRepository;

    @Override
    public ParticularUserCommandDAO createParticularUser(ParticularUserCommandDAO request) {
        try {
            ParticularUserCommandDAO particularUserCommandDAO = particularUserCommandRepository.save(request);
            if (particularUserCommandDAO != null) {
                return particularUserCommandDAO;
            }
        } catch (Exception e) {
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    "Error saving particular user"
            );
        }
        throw new ResponseStatusException(
                HttpStatus.INTERNAL_SERVER_ERROR,
                "Error saving particular user"
        );
    }
}
