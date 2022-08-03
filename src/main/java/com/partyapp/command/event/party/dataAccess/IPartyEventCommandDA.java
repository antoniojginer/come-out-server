package com.partyapp.command.event.party.dataAccess;

import com.partyapp.commons.dataAccess.event.party.PartyEventDAO;

public interface IPartyEventCommandDA {
    public PartyEventDAO createPartyEvent(PartyEventDAO event);
    public PartyEventDAO modifyPartyEvent(PartyEventDAO event, Long id);
}
