package tma.ntt.demo.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class Message {
  private String id;
  private Date receivedDateTime;
  private Recipient from;
  private Boolean isRead;
  private String subject;
  private String bodyPreview;

}
