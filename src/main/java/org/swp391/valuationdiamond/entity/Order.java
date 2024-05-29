package org.swp391.valuationdiamond.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Entity
@Table(name = "tbl_Order")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Order {

  @Id
  @Column(name = "order_id", nullable = false, length = 20)
  String orderId;

  @Column(name = "customer_name", nullable = true, length = 255)
  String customerName;

  @Column(name = "phone", nullable = true, length = 15)
  String phone;

  @Column(name = "quantity", nullable = true)
  int quantity;

  @Column(name = "status", nullable = true, length = 255)
  String status;

  @Column(name = "total_price", nullable = true)
  BigDecimal totalPrice;

  @Column(name = "orderdetail_date", nullable = true)
  Date orderDetailDate;

  @OneToMany(mappedBy = "orderId", cascade = CascadeType.ALL)
  List<EvaluationResult> evaluationResults;

  @OneToMany(mappedBy = "orderId", cascade = CascadeType.ALL)
  List<OrderDetails> orderDetails;

  @OneToMany(mappedBy = "orderId", cascade = CascadeType.ALL)
  List<CommittedPaper> committedPapers;

}
