package com.partyapp.query.event.extension.convention.dataTransfer;

import com.partyapp.query.event.dataTransfer.BaseEventDTO;
import lombok.Data;

import java.util.List;

@Data
public class ConventionEventDTO extends BaseEventDTO {
    private List<String> assistantNames;
    private Integer conventionTypeId;
    private String conventionTypeName;
}
