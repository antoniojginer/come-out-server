package com.partyapp.command.locality.dataAccess;

import com.partyapp.commons.dataAccess.command.locality.LocalityCommandDAO;

public interface ILocalityCommandDA {
    public LocalityCommandDAO saveLocality(LocalityCommandDAO request);
}
