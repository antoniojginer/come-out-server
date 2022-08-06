package com.partyapp.command.locality.service;

import com.partyapp.commons.entities.location.LocalityDTO;

public interface ILocalityCommandService {
    public void saveLocality(LocalityDTO request);
}
