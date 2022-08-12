package com.partyapp.commons.entities.user.base;

import com.partyapp.commons.entities.location.LocationDTO;
import lombok.Data;

@Data
public class BaseUserDTO {
    private Long id;
    private String email;
    private LocationDTO location;
    private String password;
}
