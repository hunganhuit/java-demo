/*
 * Copyright (c) 2018 NTT TechnoCross Corporation
 */
package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

/**
 * The Class DialPlan.
 */
@Setter
@Getter
public class DialPlan {

    /** The context. */
    private String context;

    /** The exten. */
    private String exten;

    /** The priority. */
    private Long priority;

}
