package com.partyapp.query.user.particular.dataAccess;

import com.partyapp.commons.dataAccess.query.user.particular.ParticularUserDAO;

import java.util.List;

public interface IParticularUserQueryDA {
    public ParticularUserDAO getUser(Long id);
    public List<ParticularUserDAO> getAllUsers();
}
