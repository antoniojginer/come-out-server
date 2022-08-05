package com.partyapp.commons.dataAccess.query.user.company;

import com.partyapp.commons.dataAccess.query.user.base.BaseUserDAO;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "company")
@Data
public class CompanyUserDAO {
    @Id
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "cif")
    private String cif;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id")
    private BaseUserDAO userInfo;
}
