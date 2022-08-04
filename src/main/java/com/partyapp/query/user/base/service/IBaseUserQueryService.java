package com.partyapp.query.user.base.service;

import com.partyapp.commons.entities.user.base.BaseUserDTO;

import java.util.List;

public interface IBaseUserQueryService<T extends BaseUserDTO>{
    public BaseUserDTO getUser(Long id);
    public List<T> getAllUsers();
}
