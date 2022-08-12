package com.partyapp.command.user.particular.dataAccess;

import com.partyapp.commons.dataAccess.command.user.particular.ParticularUserCommandDAO;
import com.partyapp.commons.dataAccess.query.user.particular.ParticularUserDAO;

public interface IParticularCommandDA {
    public ParticularUserCommandDAO createParticularUser(ParticularUserCommandDAO request);

}
