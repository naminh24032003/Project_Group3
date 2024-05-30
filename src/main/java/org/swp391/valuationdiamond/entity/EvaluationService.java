package org.swp391.valuationdiamond.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import java.math.BigDecimal;

@Entity
@Table(name = "tbl_Evaluation_Service")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EvaluationService {

  @Id
  @Column(name = "service_id", nullable = false, length = 255)
  String serviceId;

  @Column(name = "service_type", nullable = true, length = 100)
  String serviceType;

  @Column(name = "description", nullable = true, columnDefinition = "NVARCHAR(MAX)")
  String description;

  @Column(name = "service_price", nullable = true, precision = 18, scale = 0)
  BigDecimal servicePrice;

  @OneToMany(mappedBy = "serviceId",  cascade = CascadeType.ALL)
  List<EvaluationRequest> evaluationRequests;

  @OneToMany(mappedBy = "serviceId",  cascade = CascadeType.ALL)
  List<OrderDetails> orderDetails;




}
