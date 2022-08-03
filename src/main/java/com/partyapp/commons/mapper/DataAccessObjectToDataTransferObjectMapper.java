package com.partyapp.commons.mapper;

import com.partyapp.commons.mapper.helper.DatabaseStringToListHelper;
import com.partyapp.commons.dataAccess.event.base.BaseEventDAO;
import com.partyapp.commons.dataAccess.event.party.PartyEventDAO;
import com.partyapp.commons.entities.event.party.PartyEventDTO;
import com.partyapp.commons.entities.event.base.BaseEventDTO;
import com.partyapp.commons.dataAccess.event.convention.ConventionEventDAO;
import com.partyapp.commons.entities.event.convention.ConventionEventDTO;
import com.partyapp.commons.dataAccess.location.LocationDAO;
import com.partyapp.commons.entities.location.LocationDTO;
import com.partyapp.commons.dataAccess.user.base.BaseUserDAO;
import com.partyapp.commons.entities.user.base.BaseUserDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Mapper(componentModel = "spring")
public abstract class DataAccessObjectToDataTransferObjectMapper {

    @Autowired
    protected DatabaseStringToListHelper listHelper;


    // Location Mappers
    @Mapping(
            target = "localityId",
            source = "source.locality.localityId"
    )
    @Mapping(
            target = "localityName",
            source = "source.locality.name"
    )
    @Mapping(
            target = "countryId",
            source = "source.locality.country.id"
    )
    @Mapping(
            target = "countryName",
            source = "source.locality.country.name"
    )
    public abstract LocationDTO toLocationDto(LocationDAO source);


    // User Mappers
    public abstract BaseUserDTO toBaseUserDto(BaseUserDAO source);


    // Base Event Mappers
    public abstract BaseEventDTO toBaseEventDto(BaseEventDAO source);


    // Convention Event Mappers
    @Mapping(
            target="initDate",
            source = "source.initDate",
            dateFormat = "yyyy-MM-dd"
    )
    @Mapping(
            target="endDate",
            source = "source.endDate",
            dateFormat = "yyyy-MM-dd"
    )
    public abstract ConventionEventDTO toConventionEventDetailDto(BaseEventDAO source);

    public ConventionEventDTO toConventionEventDetailDto(ConventionEventDAO source) {
        ConventionEventDTO res = toConventionEventDetailDto(source.getEvent());
        List<String> assistantNames = listHelper.getListFromString(source.getAssistants());
        res.setAssistants(assistantNames);
        res.setConventionTypeId(source.getConventionType().getId());
        res.setConventionTypeName(source.getConventionType().getName());
        return res;
    }

    // Party Event Mappers
    @Mapping(
            target="initDate",
            source = "source.initDate",
            dateFormat = "yyyy-MM-dd"
    )
    @Mapping(
            target="endDate",
            source = "source.endDate",
            dateFormat = "yyyy-MM-dd"
    )
    public abstract PartyEventDTO toPartyEventDto(BaseEventDAO source);

    public PartyEventDTO toPartyEventDetailDto(PartyEventDAO source) {
        PartyEventDTO res = toPartyEventDto(source.getEvent());
        List<String> diskJockeys = listHelper.getListFromString(source.getDiskJockeys());
        List<String> assistants = listHelper.getListFromString(source.getAssistants());
        res.setDiskJockeys(diskJockeys);
        res.setAssistants(assistants);
        res.setPartyTypeId(source.getPartyType().getId());
        res.setPartyTypeName(source.getPartyType().getName());
        return res;
    }
}
