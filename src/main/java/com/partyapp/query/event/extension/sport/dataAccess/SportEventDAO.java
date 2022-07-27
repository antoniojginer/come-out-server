package com.partyapp.query.event.extension.sport.dataAccess;

import com.partyapp.query.event.BaseEventDAO;
import lombok.Data;

@Data
public class SportEventDAO extends BaseEventDAO {
    private String assistantNames;
    private String djNames;
    private String type;
}
