package com.partyapp.commons.dataAccess.location;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "location")
@Getter
@Setter
public class LocationDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

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

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "locality_id", referencedColumnName = "id"),
            @JoinColumn(name = "country_id", referencedColumnName = "country_id")
    })
    private LocalityDAO locality;
}
