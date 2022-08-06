package com.partyapp.commons.dataAccess.command.locality;

import com.partyapp.commons.dataAccess.query.location.CountryDAO;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "locality")
@Data
public class LocalityCommandDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "locality_generator")
    @SequenceGenerator(name = "locality_generator", sequenceName = "locality_id_seq", allocationSize = 1)
    @Column(name = "id", updatable = false, nullable = false)
    private Long localityId;

    @Column(name = "name")
    private String name;
    @Column(name="country_id", nullable = false)
    private Integer countryId;

}
