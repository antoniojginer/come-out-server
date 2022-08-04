package com.partyapp.query.user.base.dataAccess;

import com.partyapp.commons.dataAccess.query.user.base.BaseUserDAO;

import java.util.List;

public interface IBaseUserQueryDA {
    public BaseUserDAO getUser(Long id);
    public List<BaseUserDAO> getAllUsers();
}
