package com.partyapp.commons.entities.location;

import lombok.Data;

@Data
public class LocalityDTO {
    private Long id;
    private String name;
    private Integer countryId;
    private String countryName;
}
