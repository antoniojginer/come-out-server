package com.partyapp.query.user.base.controller;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.partyapp.commons.entities.user.base.BaseUserDTO;

import java.util.List;

public interface IBaseUserQueryController <T extends BaseUserDTO>{
    public BaseUserDTO getUser(Long id);
    public List<T> getAllUsers();
}
