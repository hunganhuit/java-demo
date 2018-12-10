package tma.ntt.demo.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class Contact {
    private String id;
    private String givenName;
    private String surname;
    private String companyName;
    private EmailAddress[] emailAddresses;

}
