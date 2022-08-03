package com.partyapp.commons.entities.location;

import lombok.Data;

@Data
public class LocationDTO {
    private Long id;
    private String latitude;
    private String longitude;
    private String streetName;
    private String streetType;
    private String number;
    private String level;
    private String door;
    private String postalCode;
    private Long localityId;
    private String localityName;
    private Long countryId;
    private String countryName;
}
