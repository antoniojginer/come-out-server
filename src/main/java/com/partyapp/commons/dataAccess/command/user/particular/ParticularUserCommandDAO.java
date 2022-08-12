package com.partyapp.commons.dataAccess.command.user.particular;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "particular")
@Data
public class ParticularUserCommandDAO {
    @Id
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "birthdate")
    @Temporal(TemporalType.DATE)
    private Date birthdate;
}