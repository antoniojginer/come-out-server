package com.partyapp.commons.mapper;

import com.partyapp.commons.dataAccess.command.event.base.BaseEventCommandDAO;
import com.partyapp.commons.dataAccess.command.event.party.PartyEventCommandDAO;
import com.partyapp.commons.dataAccess.command.location.LocationCommandDAO;
import com.partyapp.commons.entities.event.party.PartyEventDTO;
import com.partyapp.commons.entities.location.LocationDTO;
import com.partyapp.commons.mapper.helper.ListToDatabaseStringHelper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(componentModel = "spring")
public abstract class CommandMapper {
    @Autowired
    protected ListToDatabaseStringHelper helper;

    @Mapping(
            target = "organizer",
            source = "source.organizer.id"
    )
    @Mapping(
            target = "location",
            source = "source.location.id"
    )
    @Mapping(
            target="initDate",
            source = "source.initDate",
            dateFormat = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX"
    )
    @Mapping(
            target="endDate",
            source = "source.endDate",
            dateFormat = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX"
    )
    public abstract BaseEventCommandDAO toBaseEventCommandDAO(PartyEventDTO source);

    @Mapping(
            target = "diskJockeys",
            expression = "java(helper.getStringFromList(source.getDiskJockeys()))"
    )
    @Mapping(
            target = "assistants",
            expression = "java(helper.getStringFromList(source.getAssistants()))"
    )
    public abstract PartyEventCommandDAO toPartyEventCommandDAO(PartyEventDTO source);

    @Mapping(target = "localityId", source = "source.localityId")
    @Mapping(target = "countryId", source = "source.countryId")
    public abstract LocationCommandDAO toLocationDAO(LocationDTO source);


}
