package tma.ntt.demo.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class OutlookUser {
    private String id;
    private String mail;
    private String displayName;
}
