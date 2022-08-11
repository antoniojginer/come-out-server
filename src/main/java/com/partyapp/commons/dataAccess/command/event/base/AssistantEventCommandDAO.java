package com.partyapp.commons.dataAccess.command.event.base;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "assistant")
@IdClass(AssistanceEventCompositeKey.class)
@Data
public class AssistantEventCommandDAO {
    @Id
    @Column(name = "event_id", updatable = false, nullable = false)
    private Long eventId;

    @Id
    @Column(name = "user_id", updatable = false, nullable = false)
    private Long userId;
}
