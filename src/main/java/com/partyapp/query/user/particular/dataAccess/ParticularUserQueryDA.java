package com.partyapp.query.user.particular.dataAccess;

import com.partyapp.commons.dataAccess.query.user.particular.ParticularUserDAO;
import com.partyapp.query.user.particular.dataAccess.jpaRepository.ParticularUserQueryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class ParticularUserQueryDA implements IParticularUserQueryDA {

    @Autowired
    private ParticularUserQueryRepository particularUserQueryRepository;

    @Override
    public ParticularUserDAO getUser(Long id) {
        try {
            Optional<ParticularUserDAO> particularUserDAO = particularUserQueryRepository.findById(id);
            if (!particularUserDAO.isEmpty()) {
                return particularUserDAO.get();
            }
        } catch (Exception e) {
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    "Error getting particular user detail"
            );
        }
        throw new ResponseStatusException(
                HttpStatus.NOT_FOUND,
                "Particular user not found"
        );
    }

    @Override
    public List<ParticularUserDAO> getAllUsers() {
        try {
            List<ParticularUserDAO> particularUserDAO = particularUserQueryRepository.findAll();
            if (!particularUserDAO.isEmpty()) {
                return particularUserDAO;
            }
        } catch (Exception e) {
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    "Error getting all particular users list"
            );
        }
        throw new ResponseStatusException(
                HttpStatus.NOT_FOUND,
                "Empty response in get all particular users query"
        );
    }
}
