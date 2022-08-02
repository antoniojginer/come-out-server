package com.partyapp.query.user.service;

import com.partyapp.query.location.service.LocationDTO;
import lombok.Data;

@Data
public class BaseUserDTO {
    private Long id;
    private String email;
    private LocationDTO location;
}
