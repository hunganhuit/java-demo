package tma.ntt.demo.entity;


import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class DateTimeTimeZone {
    private Date dateTime;
    private String timeZone;
}
