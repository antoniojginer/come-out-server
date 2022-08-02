package com.partyapp.query.event.extension.convention.service;

import com.partyapp.query.event.service.BaseEventDTO;
import lombok.Data;

import java.util.List;

@Data
public class ConventionEventDTO extends BaseEventDTO {
    private List<String> assistants;
    private Integer conventionTypeId;
    private String conventionTypeName;
}
