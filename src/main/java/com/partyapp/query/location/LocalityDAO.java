package com.partyapp.query.location;

import javax.persistence.*;

@Entity
@Table(name = "locality")
@IdClass(LocalityCompositeKey.class)
public class LocalityDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long localityId;

    @Id
    @ManyToOne(optional = false)
    @PrimaryKeyJoinColumn(name="country_id", referencedColumnName="id")
    private CountryDAO country;

    @Column(name = "name")
    private String name;

}
