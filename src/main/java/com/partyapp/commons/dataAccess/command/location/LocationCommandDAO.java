package com.partyapp.commons.dataAccess.command.location;

import com.partyapp.commons.dataAccess.query.location.LocalityDAO;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Location")
@Data
public class LocationCommandDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "location_generator")
    @SequenceGenerator(name = "location_generator", sequenceName = "location_id_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "locality_id")
    private Long localityId;
    @Column(name = "country_id")
    private Integer countryId;

    @Column(name = "latitude")
    private String latitude;
    @Column(name = "longitude")
    private String longitude;

    @Column(name = "street_name")
    private String streetName;
    @Column(name = "street_type")
    private String streetType;
    @Column(name = "street_number")
    private String number;
    @Column(name = "level")
    private String level;
    @Column(name = "door")
    private String door;
    @Column(name = "postal_code")
    private String postalCode;

}
