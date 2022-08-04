package com.partyapp.query.user.base.dataAccess;

import com.partyapp.commons.dataAccess.query.user.base.BaseUserDAO;
import com.partyapp.query.user.base.dataAccess.jpaRepository.BaseUserQueryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class BaseUserQueryDA implements IBaseUserQueryDA {

    @Autowired
    private BaseUserQueryRepository baseUserQueryRepository;

    @Override
    public BaseUserDAO getUser(Long id) {
        try {
            Optional<BaseUserDAO> baseUserDAO = baseUserQueryRepository.findById(id);
            if (!baseUserDAO.isEmpty()) {
                return baseUserDAO.get();
            }
        } catch (Exception e) {
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    "Error getting user"
            );
        }
        throw new ResponseStatusException(
                HttpStatus.NOT_FOUND,
                "User not found"
        );
    }

    @Override
    public List<BaseUserDAO> getAllUsers() {
        // TODO
        return null;
    }
}
