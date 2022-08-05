package com.partyapp.commons.dataAccess.query.location;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@AllArgsConstructor
public class LocalityCompositeKey implements Serializable {
    public LocalityCompositeKey() {
        this.localityId = 0l;
        this.country = 0;
    }

    private Long localityId;
    private int country;
}
