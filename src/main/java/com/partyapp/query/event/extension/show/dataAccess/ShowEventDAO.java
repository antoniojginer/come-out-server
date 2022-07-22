package com.partyapp.query.event.extension.show.dataAccess;

import com.partyapp.query.event.BaseEventDAO;
import lombok.Data;

@Data
public class ShowEventDAO extends BaseEventDAO {
    private String assistantNames;
    private String djNames;
    private String type;
}
