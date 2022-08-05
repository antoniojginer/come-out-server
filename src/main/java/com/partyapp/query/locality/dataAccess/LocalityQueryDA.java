package com.partyapp.query.locality.dataAccess;

import com.partyapp.commons.dataAccess.query.location.LocalityCompositeKey;
import com.partyapp.commons.dataAccess.query.location.LocalityDAO;
import com.partyapp.commons.entities.location.LocalityDTO;
import com.partyapp.query.locality.dataAccess.jpaRepository.LocalityQueryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.security.spec.ECField;
import java.util.List;
import java.util.Optional;

@Service
public class LocalityQueryDA implements ILocalityQueryDA {

    @Autowired
    private LocalityQueryRepository localityQueryRepository;

    @Override
    public LocalityDAO getLocalityById(Long id, Integer countryId) {
        try {
            LocalityCompositeKey localityPk = new LocalityCompositeKey(id, countryId);
            Optional<LocalityDAO> localityDaoById = localityQueryRepository.findById(localityPk);
            if (!localityDaoById.isEmpty()) {
                return localityDaoById.get();
            }
        } catch (Exception e) {
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    "Error getting location detail by id"
            );
        }
        throw new ResponseStatusException(
                HttpStatus.NOT_FOUND,
                "Locality not found"
        );
    }

    @Override
    public LocalityDAO getLocalityByName(String name) {
        try {
            LocalityDAO localityDaoByName =
                    localityQueryRepository.getLocalityByName(name);
            if (localityDaoByName != null) {
                return localityDaoByName;
            }
        } catch (Exception e) {
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    "Locality not found in search by name"
            );
        }
        throw new ResponseStatusException(
                HttpStatus.NOT_FOUND,
                "Locality not found"
        );
    }

    @Override
    public List<LocalityDAO> getAllLocalities() {
        try {
            List<LocalityDAO> localities = localityQueryRepository.findAll();
            if (!localities.isEmpty()) {
                return localities;
            }
        } catch (Exception e) {
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    "Error getting all localities"
            );
        }
        throw new ResponseStatusException(
                HttpStatus.NOT_FOUND,
                "Empty localities query result"
        );
    }
}
