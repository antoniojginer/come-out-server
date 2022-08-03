package com.partyapp.commons.mapper;

import com.partyapp.query.event.dataAccess.BaseEventDAO;
import com.partyapp.query.event.extension.convention.service.ConventionEventDTO;
import com.partyapp.query.event.service.BaseEventDTO;
import com.partyapp.query.location.dataAccess.CountryDAO;
import com.partyapp.query.location.dataAccess.LocalityDAO;
import com.partyapp.query.location.dataAccess.LocationDAO;
import com.partyapp.query.location.service.LocationDTO;
import com.partyapp.query.user.dataAccess.BaseUserDAO;
import com.partyapp.query.user.service.BaseUserDTO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-08-03T11:20:53+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 17.0.3.1 (Oracle Corporation)"
)
@Component
public class DataAccessObjectToDataTransferObjectMapperImpl extends DataAccessObjectToDataTransferObjectMapper {

    @Override
    public LocationDTO toLocationDto(LocationDAO source) {
        if ( source == null ) {
            return null;
        }

        LocationDTO locationDTO = new LocationDTO();

        locationDTO.setLocalityName( sourceLocalityName( source ) );
        locationDTO.setCountryName( sourceLocalityCountryName( source ) );
        locationDTO.setLocalityId( sourceLocalityLocalityId( source ) );
        Integer id = sourceLocalityCountryId( source );
        if ( id != null ) {
            locationDTO.setCountryId( id.longValue() );
        }
        locationDTO.setId( source.getId() );
        locationDTO.setLatitude( source.getLatitude() );
        locationDTO.setLongitude( source.getLongitude() );
        locationDTO.setStreetName( source.getStreetName() );
        locationDTO.setStreetType( source.getStreetType() );
        locationDTO.setNumber( source.getNumber() );
        locationDTO.setLevel( source.getLevel() );
        locationDTO.setDoor( source.getDoor() );
        locationDTO.setPostalCode( source.getPostalCode() );

        return locationDTO;
    }

    @Override
    public BaseUserDTO toBaseUserDto(BaseUserDAO source) {
        if ( source == null ) {
            return null;
        }

        BaseUserDTO baseUserDTO = new BaseUserDTO();

        baseUserDTO.setId( source.getId() );
        baseUserDTO.setEmail( source.getEmail() );
        baseUserDTO.setLocation( toLocationDto( source.getLocation() ) );

        return baseUserDTO;
    }

    @Override
    public BaseEventDTO toBaseEventDto(BaseEventDAO source) {
        if ( source == null ) {
            return null;
        }

        BaseEventDTO baseEventDTO = new BaseEventDTO();

        baseEventDTO.setId( source.getId() );
        baseEventDTO.setName( source.getName() );
        baseEventDTO.setDescription( source.getDescription() );
        baseEventDTO.setMaxTickets( source.getMaxTickets() );
        baseEventDTO.setTicketPrice( source.getTicketPrice() );
        baseEventDTO.setCapacity( source.getCapacity() );
        try {
            if ( source.getInitDate() != null ) {
                baseEventDTO.setInitDate( new SimpleDateFormat().parse( source.getInitDate() ) );
            }
        }
        catch ( ParseException e ) {
            throw new RuntimeException( e );
        }
        try {
            if ( source.getEndDate() != null ) {
                baseEventDTO.setEndDate( new SimpleDateFormat().parse( source.getEndDate() ) );
            }
        }
        catch ( ParseException e ) {
            throw new RuntimeException( e );
        }
        baseEventDTO.setIsPublic( source.getIsPublic() );
        baseEventDTO.setIsMooneyPoolShown( source.getIsMooneyPoolShown() );
        baseEventDTO.setEventType( source.getEventType() );
        baseEventDTO.setOrganizerType( source.getOrganizerType() );
        baseEventDTO.setOrganizer( toBaseUserDto( source.getOrganizer() ) );
        baseEventDTO.setLocation( toLocationDto( source.getLocation() ) );

        return baseEventDTO;
    }

    @Override
    public ConventionEventDTO toConventionEventDto(BaseEventDAO source) {
        if ( source == null ) {
            return null;
        }

        ConventionEventDTO conventionEventDTO = new ConventionEventDTO();

        try {
            if ( source.getEndDate() != null ) {
                conventionEventDTO.setEndDate( new SimpleDateFormat( "yyyy-MM-dd" ).parse( source.getEndDate() ) );
            }
        }
        catch ( ParseException e ) {
            throw new RuntimeException( e );
        }
        try {
            if ( source.getInitDate() != null ) {
                conventionEventDTO.setInitDate( new SimpleDateFormat( "yyyy-MM-dd" ).parse( source.getInitDate() ) );
            }
        }
        catch ( ParseException e ) {
            throw new RuntimeException( e );
        }
        conventionEventDTO.setId( source.getId() );
        conventionEventDTO.setName( source.getName() );
        conventionEventDTO.setDescription( source.getDescription() );
        conventionEventDTO.setMaxTickets( source.getMaxTickets() );
        conventionEventDTO.setTicketPrice( source.getTicketPrice() );
        conventionEventDTO.setCapacity( source.getCapacity() );
        conventionEventDTO.setIsPublic( source.getIsPublic() );
        conventionEventDTO.setIsMooneyPoolShown( source.getIsMooneyPoolShown() );
        conventionEventDTO.setEventType( source.getEventType() );
        conventionEventDTO.setOrganizerType( source.getOrganizerType() );
        conventionEventDTO.setOrganizer( toBaseUserDto( source.getOrganizer() ) );
        conventionEventDTO.setLocation( toLocationDto( source.getLocation() ) );

        return conventionEventDTO;
    }

    private String sourceLocalityName(LocationDAO locationDAO) {
        if ( locationDAO == null ) {
            return null;
        }
        LocalityDAO locality = locationDAO.getLocality();
        if ( locality == null ) {
            return null;
        }
        String name = locality.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private String sourceLocalityCountryName(LocationDAO locationDAO) {
        if ( locationDAO == null ) {
            return null;
        }
        LocalityDAO locality = locationDAO.getLocality();
        if ( locality == null ) {
            return null;
        }
        CountryDAO country = locality.getCountry();
        if ( country == null ) {
            return null;
        }
        String name = country.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private Long sourceLocalityLocalityId(LocationDAO locationDAO) {
        if ( locationDAO == null ) {
            return null;
        }
        LocalityDAO locality = locationDAO.getLocality();
        if ( locality == null ) {
            return null;
        }
        Long localityId = locality.getLocalityId();
        if ( localityId == null ) {
            return null;
        }
        return localityId;
    }

    private Integer sourceLocalityCountryId(LocationDAO locationDAO) {
        if ( locationDAO == null ) {
            return null;
        }
        LocalityDAO locality = locationDAO.getLocality();
        if ( locality == null ) {
            return null;
        }
        CountryDAO country = locality.getCountry();
        if ( country == null ) {
            return null;
        }
        int id = country.getId();
        return id;
    }
}
