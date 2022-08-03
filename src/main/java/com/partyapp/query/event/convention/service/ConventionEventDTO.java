package com.partyapp.query.event.convention.service;

import com.partyapp.query.event.base.service.BaseEventDTO;
import lombok.Data;

import java.util.List;

@Data
public class ConventionEventDTO extends BaseEventDTO {
    private List<String> assistants;
    private Integer conventionTypeId;
    private String conventionTypeName;
}
