package com.partyapp.commons.mapper;

import com.partyapp.commons.dataAccess.command.country.CountryCommandDAO;
import com.partyapp.commons.dataAccess.command.event.base.AssistantEventCommandDAO;
import com.partyapp.commons.dataAccess.command.event.base.BaseEventCommandDAO;
import com.partyapp.commons.dataAccess.command.event.party.PartyEventCommandDAO;
import com.partyapp.commons.dataAccess.command.locality.LocalityCommandDAO;
import com.partyapp.commons.dataAccess.command.location.LocationCommandDAO;
import com.partyapp.commons.dataAccess.command.user.base.BaseUserCommandDAO;
import com.partyapp.commons.dataAccess.command.user.particular.ParticularUserCommandDAO;
import com.partyapp.commons.dataAccess.query.user.base.BaseUserDAO;
import com.partyapp.commons.dataAccess.query.user.login.LoginDAO;
import com.partyapp.commons.entities.event.AssistantEventDTO;
import com.partyapp.commons.entities.event.party.PartyEventDTO;
import com.partyapp.commons.entities.location.CountryDTO;
import com.partyapp.commons.entities.location.LocalityDTO;
import com.partyapp.commons.entities.location.LocationDTO;
import com.partyapp.commons.entities.user.LoginDTO;
import com.partyapp.commons.entities.user.base.BaseUserDTO;
import com.partyapp.commons.entities.user.particular.ParticularUserDTO;
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

    public PartyEventDTO toPartyEventDTO(
            BaseEventCommandDAO baseEventDAO,
            PartyEventCommandDAO partyEventDAO,
            LocationCommandDAO locationCommandDAO,
            LocalityCommandDAO localityCommandDAO,
            BaseUserDAO baseUserDAO
    ) {
        LocalityDTO localityDTO = toLocalityDTO(localityCommandDAO);
        //LocationDTO locationDTO
        return null;
    }

    // Location mapper
    @Mapping(target = "localityId", source = "source.localityId")
    @Mapping(target = "countryId", source = "source.countryId")
    public abstract LocationCommandDAO toLocationDAO(LocationDTO source);

    public abstract LocationDTO toLocationDTO(LocationCommandDAO source);

    @Mapping(
            target = "name",
            source = "source.localityName"
    )
    @Mapping(
            target = "id",
            source = "source.localityId"
    )
    public abstract LocalityDTO toLocalityDTO(LocationDTO source);

    public abstract LocalityCommandDAO toLocalityCommandDAO(LocalityDTO source);

    @Mapping(
            target = "id",
            source = "source.localityId"
    )
    public abstract LocalityDTO toLocalityDTO(LocalityCommandDAO source);

    @Mapping(
            target = "id",
            source = "source.countryId"
    )
    @Mapping(
            target = "name",
            source = "source.countryName"
    )
    public abstract CountryDTO toCountryDTO(LocationDTO source);

    public abstract CountryDTO toCountryDTO(CountryCommandDAO source);

    public abstract CountryCommandDAO toCountryDAO(CountryDTO source);

    public abstract AssistantEventDTO toAssistantEventDTO(AssistantEventCommandDAO source);

    public abstract AssistantEventCommandDAO toAssistantEventCommandDAO(AssistantEventDTO source);

    @Mapping(target = "location.id", source = "source.location.id")
    public abstract BaseUserDTO toBaseUserCommandDTO(ParticularUserDTO source);

    @Mapping(target = "locationId", source = "source.location.id")
    public abstract BaseUserCommandDAO toBaseUserCommandDAO(BaseUserDTO source);

    public abstract LoginDTO toLoginDTO(ParticularUserDTO source);

    public abstract LoginDAO toLoginDAO(LoginDTO source);

    public abstract LoginDTO toLoginDTO(LoginDAO source);

    public abstract ParticularUserCommandDAO toParticularUserCommandDAO(ParticularUserDTO source);
}
