package com.itwa.util;

import com.fasterxml.jackson.databind.ObjectMapper;

public final class MappingUtils {
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    private MappingUtils() {
    }

    public static <T> T convertObjectWithType(Object object, Class<T> type) {
        return OBJECT_MAPPER.convertValue(object, type);
    }
}
