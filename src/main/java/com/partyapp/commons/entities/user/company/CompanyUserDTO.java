package com.partyapp.commons.entities.user.company;

import com.partyapp.commons.entities.user.base.BaseUserDTO;
import lombok.Data;

@Data
public class CompanyUserDTO extends BaseUserDTO {
    private String cif;
    private String name;
}
