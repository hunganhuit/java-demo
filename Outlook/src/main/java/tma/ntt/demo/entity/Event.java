package tma.ntt.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class Event {
    private String id;
    private String subject;
    private Recipient organizer;
    private DateTimeTimeZone start;
    private DateTimeTimeZone end;
}
