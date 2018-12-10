package com.example.demo.common;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DemoUtil {
    /** The Constant mapper. */
    private static final ObjectMapper mapper = new ObjectMapper();

    /**
     * Read json from file.
     *
     * @param filePath String
     * @param map the type reference
     * @return Object
     */
    public static Object readJsonFile(String filePath, TypeReference<?> typeReference) {
        // get data from file

        Object object = null;
        byte[] jsonData;
        try {
            jsonData = Files.readAllBytes(Paths.get(filePath));
            // read json to object
            object = mapper.readValue(jsonData, typeReference);

        } catch (IOException e) {

        }
        return object;
    }

}
