package com.partyapp.command.user.base.service;

import com.partyapp.commons.entities.user.base.BaseUserDTO;

public interface IBaseUserCommandService {
    public BaseUserDTO saveBaseUser(BaseUserDTO request);
}
