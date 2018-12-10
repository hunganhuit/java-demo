/*
 * Copyright (c) 2018 NTT TechnoCross Corporation
 */
package com.example.demo.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

/**
 * The Class Channels.
 */
@Getter
@Setter
public class Channels {

    /** The id. */
    private String id;

    /** The name. */
    private String name;

    /** The state. */
    private String state;

    /** The caller. */
    private Caller caller;

    /** The connected. */
    private Connected connected;

    /** The accountcode. */
    @JsonProperty("accountcode")
    private String accountCode;

    /** The dialplan. */
    @JsonProperty("dialplan")
    private DialPlan dialPlan;

    /** The creationtime. */
    @JsonProperty("creationtime")
    private Date creationTime;

    /** The language. */
    private String language;

}
