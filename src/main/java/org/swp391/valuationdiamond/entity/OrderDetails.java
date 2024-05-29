package org.swp391.valuationdiamond.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import org.springframework.stereotype.Service;

@Entity
@Table(name = "tbl_Order_Details")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderDetails {

  @Id
  @Column(name = "orderdetail_id", nullable = false, length = 20)
  String orderDetailId;

  @Column(name = "received_date", nullable = true)
  Date receivedDate;

  @Column(name = "expired_received_dates", nullable = true)
  Date expiredReceivedDates;

  @Column(name = "unit_price", nullable = true)
  BigDecimal unitPrice;

  @Column(name = "status", nullable = true, length = 255)
  String status;

  @ManyToOne
  @JoinColumn(name = "account_id")
  Account accountId;

  @ManyToOne
  @JoinColumn(name = "service_id")
  EvaluationService serviceId;

  @ManyToOne
  @JoinColumn(name = "order_id")
  Order orderId;

  @ManyToOne
  @JoinColumn(name = "asses_id")
  DiamondAssessment assessId;

}
