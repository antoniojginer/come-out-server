package com.partyapp.commons.entities.user;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LoginDTO {
    private String id;
    private String email;
    private String password;
}
