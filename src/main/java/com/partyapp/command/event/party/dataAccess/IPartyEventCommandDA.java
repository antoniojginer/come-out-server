package com.partyapp.command.event.party.dataAccess;

import com.partyapp.commons.dataAccess.command.event.party.PartyEventCommandDAO;

public interface IPartyEventCommandDA {
    public void createPartyEvent(PartyEventCommandDAO partyEvent);
    public void modifyPartyEvent(PartyEventCommandDAO event, Long id);
}
