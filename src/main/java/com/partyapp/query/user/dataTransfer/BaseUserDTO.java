package com.partyapp.query.user.dataTransfer;

import com.partyapp.query.location.dataTransfer.LocationDTO;
import lombok.Data;

@Data
public class BaseUserDTO {
    private Long id;
    private String email;
    private LocationDTO location;
}
