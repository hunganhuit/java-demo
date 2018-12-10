/*
 * Copyright (c) 2018 NTT TechnoCross Corporation
 */
package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

/**
 * The Class Endpoints.
 */
@Setter
@Getter
public class Endpoints {

    /** The technology. */
    private String technology;

    /** The resource. */
    private String resource;

    /** The state. */
    private String state;

    /** The channel ids. */
    private String[] channel_ids;

}
