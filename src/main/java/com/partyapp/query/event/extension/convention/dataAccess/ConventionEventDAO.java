package com.partyapp.query.event.extension.convention.dataAccess;

import com.partyapp.query.event.BaseEventDAO;
import lombok.Data;

@Data
public class ConventionEventDAO extends BaseEventDAO {
    private String assistantNames;
    private String djNames;
    private String type;
}
