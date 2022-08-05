package com.partyapp.commons.mapper;

import com.partyapp.commons.dataAccess.query.user.company.CompanyUserDAO;
import com.partyapp.commons.dataAccess.query.user.particular.ParticularUserDAO;
import com.partyapp.commons.entities.user.company.CompanyUserDTO;
import com.partyapp.commons.entities.user.particular.ParticularUserDTO;
import com.partyapp.commons.mapper.helper.DatabaseStringToListHelper;
import com.partyapp.commons.dataAccess.query.event.base.BaseEventDAO;
import com.partyapp.commons.dataAccess.query.event.party.PartyEventDAO;
import com.partyapp.commons.entities.event.party.PartyEventDTO;
import com.partyapp.commons.entities.event.base.BaseEventDTO;
import com.partyapp.commons.dataAccess.query.event.convention.ConventionEventDAO;
import com.partyapp.commons.entities.event.convention.ConventionEventDTO;
import com.partyapp.commons.dataAccess.query.location.LocationDAO;
import com.partyapp.commons.entities.location.LocationDTO;
import com.partyapp.commons.dataAccess.query.user.base.BaseUserDAO;
import com.partyapp.commons.entities.user.base.BaseUserDTO;
import com.partyapp.query.user.company.dataAccess.CompanyUserQueryDA;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Mapper(componentModel = "spring")
public abstract class QueryMapper {

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


    public CompanyUserDTO toCompanyUserDetailDto(CompanyUserDAO source) {
        BaseUserDTO baseUserDTO = toBaseUserDto(source.getUserInfo());
        CompanyUserDTO res = new CompanyUserDTO();
        res.setId(baseUserDTO.getId());
        res.setEmail(baseUserDTO.getEmail());
        res.setLocation(baseUserDTO.getLocation());
        res.setCif(source.getCif());
        res.setName(source.getName());
        return res;
    }

    public ParticularUserDTO toParticularUserDetailDto(ParticularUserDAO source) {
        BaseUserDTO baseUserDTO = toBaseUserDto(source.getUserInfo());
        ParticularUserDTO res = new ParticularUserDTO();
        res.setId(baseUserDTO.getId());
        res.setEmail(baseUserDTO.getEmail());
        res.setLocation(baseUserDTO.getLocation());
        res.setName(source.getName());
        res.setSurname(source.getSurname());
        res.setBirthdate(source.getBirthdate());
        return res;
    }

    // Base Event Mappers
    public abstract BaseEventDTO toBaseEventDto(BaseEventDAO source);


    // Convention Event Mappers
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
            dateFormat = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX"
    )
    @Mapping(
            target="endDate",
            source = "source.endDate",
            dateFormat = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX"
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

    public abstract BaseEventDAO toBaseEventDAO(PartyEventDTO source);
}
