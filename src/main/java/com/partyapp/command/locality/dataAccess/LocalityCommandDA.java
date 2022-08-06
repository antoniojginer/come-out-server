package com.partyapp.command.locality.dataAccess;

import com.partyapp.command.locality.dataAccess.jpaRepository.LocalityCommandRepository;
import com.partyapp.commons.dataAccess.command.locality.LocalityCommandDAO;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class LocalityCommandDA implements ILocalityCommandDA {

    @Autowired
    private LocalityCommandRepository localityCommandRepository;

    @Override
    public LocalityCommandDAO saveLocality(LocalityCommandDAO request) {
        try {
            LocalityCommandDAO localityCommandDAO = localityCommandRepository.save(request);
            if (localityCommandDAO != null) {
                return localityCommandDAO;
            }
        } catch (Exception e) {
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    "Error saving locality"
            );
        }
        throw new ResponseStatusException(
                HttpStatus.INTERNAL_SERVER_ERROR,
                "Empty response saving locality"
        );
    }
}
