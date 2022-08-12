package com.partyapp.command.user.base.dataAccess;

import com.partyapp.command.user.base.dataAccess.jpaRepository.BaseUserCommandRepository;
import com.partyapp.commons.dataAccess.command.user.base.BaseUserCommandDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class BaseUserCommandDA implements IBaseUserCommandDA {

    @Autowired
    private BaseUserCommandRepository baseUserCommandRepository;

    @Override
    public BaseUserCommandDAO saveBaseUser(BaseUserCommandDAO request) {
        try {
            BaseUserCommandDAO baseUserCommandDAO = baseUserCommandRepository.save(request);
            if (baseUserCommandDAO != null) {
                return baseUserCommandDAO;
            }
        } catch (Exception e) {
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    "Error saving base user"
            );
        }
        throw new ResponseStatusException(
                HttpStatus.INTERNAL_SERVER_ERROR,
                "Error saving base user"
        );
    }
}
