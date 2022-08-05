package com.partyapp.commons.entities.user.particular;

import com.partyapp.commons.entities.user.base.BaseUserDTO;
import lombok.Data;

import java.util.Date;

@Data
public class ParticularUserDTO extends BaseUserDTO {
    private String name;
    private String surname;
    private Date birthdate;
}
