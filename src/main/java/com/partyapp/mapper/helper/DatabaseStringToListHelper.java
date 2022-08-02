package com.partyapp.mapper.helper;

import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class DatabaseStringToListHelper {

    public List<String> getListFromString(String source) {
        if (source == null || source.isEmpty() || !source.contains(",")) {
            return new ArrayList<String>();
        }
        String[] aux = source
                .replace("{", "")
                .replace("}", "")
                .split(",");
        return Arrays.asList(aux);
    }
}
