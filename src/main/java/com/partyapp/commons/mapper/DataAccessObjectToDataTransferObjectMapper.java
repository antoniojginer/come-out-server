package com.partyapp.commons.mapper;

import com.partyapp.commons.mapper.helper.DatabaseStringToListHelper;
import com.partyapp.query.event.dataAccess.BaseEventDAO;
import com.partyapp.query.event.service.BaseEventDTO;
import com.partyapp.query.event.extension.convention.dataAccess.ConventionEventDAO;
import com.partyapp.query.event.extension.convention.service.ConventionEventDTO;
import com.partyapp.query.location.dataAccess.LocationDAO;
import com.partyapp.query.location.service.LocationDTO;
import com.partyapp.query.user.dataAccess.BaseUserDAO;
import com.partyapp.query.user.service.BaseUserDTO;
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
    public abstract ConventionEventDTO toConventionEventDto(BaseEventDAO source);

    public ConventionEventDTO toConventionEventDto(ConventionEventDAO source) {
        ConventionEventDTO res = toConventionEventDto(source.getEvent());
        List<String> assistantNames = listHelper.getListFromString(source.getAssistants());
        res.setAssistants(assistantNames);
        res.setConventionTypeId(source.getConventionType().getId());
        res.setConventionTypeName(source.getConventionType().getName());
        return res;
    }
}
