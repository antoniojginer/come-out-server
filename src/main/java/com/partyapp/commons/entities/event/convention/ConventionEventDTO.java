package com.partyapp.commons.entities.event.convention;

import com.partyapp.commons.entities.event.base.BaseEventDTO;
import lombok.Data;

import java.util.List;

@Data
public class ConventionEventDTO extends BaseEventDTO {
    private List<String> assistants;
    private Integer conventionTypeId;
    private String conventionTypeName;
}
