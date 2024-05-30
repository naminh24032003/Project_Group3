package org.swp391.valuationdiamond.dto;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EvaluationRequestDTO {
  String requestId;
  String requestDescription;
  Date requestDate;
  String requestEmail;
  String guestName;
  String status;
  String phoneNumber;
  String accountId;
  String serviceId;

}
