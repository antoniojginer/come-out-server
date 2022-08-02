package com.partyapp.query.location.dataAccess;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "locality")
@IdClass(LocalityCompositeKey.class)
@Data
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
