package com.partyapp.commons.dataAccess.query.event.base;

import com.partyapp.commons.dataAccess.query.location.CountryDAO;
import com.partyapp.commons.dataAccess.query.location.LocalityCompositeKey;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "assistant")
@IdClass(AssistanceEventCompositeKey.class)
@Data
public class AssistanceEventDAO {
    @Id
    @Column(name = "event_id", updatable = false, nullable = false)
    private Long eventId;

    @Id
    @Column(name = "user_id", updatable = false, nullable = false)
    private Long userId;
}
