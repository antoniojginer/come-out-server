package com.partyapp.mapper;

import com.partyapp.mapper.helper.DatabaseStringToListHelper;
import com.partyapp.query.event.dataAccess.BaseEventDAO;
import com.partyapp.query.event.dataTransfer.BaseEventDTO;
import com.partyapp.query.event.extension.convention.dataAccess.ConventionEventDAO;
import com.partyapp.query.event.extension.convention.dataAccess.ConventionTypeDAO;
import com.partyapp.query.event.extension.convention.dataTransfer.ConventionEventDTO;
import com.partyapp.query.location.dataAccess.LocalityDAO;
import com.partyapp.query.location.dataAccess.LocationDAO;
import com.partyapp.query.location.dataTransfer.LocationDTO;
import com.partyapp.query.user.dataAccess.BaseUserDAO;
import com.partyapp.query.user.dataTransfer.BaseUserDTO;
import org.hibernate.boot.jaxb.internal.stax.BaseXMLEventReader;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Mapper(componentModel = "spring")
public abstract class ConventionEventDaoToConventionEventDtoMapper {

    @Autowired
    protected DatabaseStringToListHelper listHelper;

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
    public abstract ConventionEventDTO baseEventDaoToConventionEventDto(BaseEventDAO source);
    public abstract BaseEventDTO baseEventDaoToBaseEventDto(BaseEventDAO source);
    public abstract BaseUserDTO baseUserDaoToBaseUserDto(BaseUserDAO source);

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
    public abstract LocationDTO locationDaoToLocationDto(LocationDAO source);

    public ConventionEventDTO toConventionEventDto(ConventionEventDAO source) {
        ConventionEventDTO res = baseEventDaoToConventionEventDto(source.getEvent());
        List<String> assistantNames = listHelper.getListFromString(source.getAssistantNames());
        res.setAssistantNames(assistantNames);
        res.setConventionTypeId(source.getConventionType().getId());
        res.setConventionTypeName(source.getConventionType().getName());
        return res;
    }
}
