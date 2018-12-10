package tma.ntt.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class PagedResult<T> {
    @JsonProperty("@odata.nextLink")
    private String nextPageLink;
    private T[] value;


}
