package com.example.demo.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Channels;
import com.example.demo.model.Endpoints;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * The Class ApiController.
 */
@RestController
public class ApiController {

    /** The base directory. */
    private static String BASE_DIRECTORY = "/opt/voicecomcloud/asterisk/";

    /** The endpoints. */
    private static String ENDPOINTS = "Endpoints.json";

    /** The channels. */
    private static String CHANNELS = "Channels.json";

    /**
     * Gets the endpoints.
     *
     * @return the endpoints
     */
    @SuppressWarnings("unchecked")
    @GetMapping("/endpoints")
    public ResponseEntity<?> getEndpoints() {
        List<Endpoints> endpoinList = (List<Endpoints>) readJsonFile(BASE_DIRECTORY + ENDPOINTS, new TypeReference<Object>() {});
        return new ResponseEntity<List<Endpoints>>(endpoinList, HttpStatus.OK);
    }

    /**
     * Gets the channels.
     *
     * @return the channels
     */
    @SuppressWarnings("unchecked")
    @GetMapping("/channels")
    public ResponseEntity<?> getChannels() {
        List<Channels> channelList = (List<Channels>) readJsonFile(BASE_DIRECTORY + CHANNELS, new TypeReference<List<Channels>>() {});
        return new ResponseEntity<List<Channels>>(channelList, HttpStatus.OK);
    }

    /**
     * Gets the channel by id.
     *
     * @param channelId the channel id
     * @return the channel by id
     */
    @SuppressWarnings("unchecked")
    @GetMapping("/channels/{channelId}")
    public ResponseEntity<?> getChannelById(@PathVariable("channelId") String channelId) {
        List<Channels> channelList = (List<Channels>) readJsonFile(BASE_DIRECTORY + CHANNELS, new TypeReference<List<Channels>>() {});
        for (Channels channel : channelList) {
            if (channel.getId().equals(channelId)) {
                return new ResponseEntity<Channels>(channel, HttpStatus.OK);
            }
        }
        return new ResponseEntity<String>("ChannelId is incorect!", HttpStatus.NOT_FOUND);
    }

    /**
     * Read json from file.
     *
     * @param filePath String
     * @param typeReference the type reference
     * @return Object
     */
    public static Object readJsonFile(String filePath, TypeReference<?> typeReference) {
        // get data from file
        Object object = null;
        byte[] jsonData;
        try {
            jsonData = Files.readAllBytes(Paths.get(filePath));
            // read json to object
            ObjectMapper mapper = new ObjectMapper();
            object = mapper.readValue(jsonData, typeReference);
        } catch (IOException e) {
            System.out.println(e);
        }
        return object;
    }

}
