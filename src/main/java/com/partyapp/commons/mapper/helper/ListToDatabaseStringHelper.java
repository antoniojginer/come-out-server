package com.partyapp.commons.mapper.helper;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ListToDatabaseStringHelper {

    public static String getStringFromList(List<String> list) {
        return list.stream().collect(Collectors.joining(",", "{", "}"));
    }
}
