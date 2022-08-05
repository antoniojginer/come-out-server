package com.partyapp.command.location.controller;

import com.partyapp.commons.entities.location.LocationDTO;

public interface ILocationCommandController {
    public void saveLocality(LocationDTO request);
}
