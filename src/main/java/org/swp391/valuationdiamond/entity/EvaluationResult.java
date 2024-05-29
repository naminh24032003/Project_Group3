package org.swp391.valuationdiamond.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "tbl_Evaluation_Result")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EvaluationResult {

  @Id
  @Column(name = "evaluation_result_id", nullable = false, length = 255)
  String evaluationResultId;

  @Column(name = "diamond_origin", nullable = true, length = 50)
  String diamondOrigin;

  @Column(name = "measurements", nullable = true, length = 255)
  String measurements;

  @Column(name = "proportions", nullable = true, length = 255)
  String proportions;

  @Column(name = "shape_cut", nullable = true, length = 50)
  String shapeCut;

  @Column(name = "carat_weight", nullable = true, precision = 18, scale = 2)
  BigDecimal caratWeight;

  @Column(name = "color", nullable = true, length = 50)
  String color;

  @Column(name = "clarity", nullable = true, length = 50)
  String clarity;

  @Column(name = "cut", nullable = true, length = 50)
  String cut;

  @Column(name = "symmetry", nullable = true, length = 50)
  String symmetry;

  @Column(name = "polish", nullable = true, length = 50)
  String polish;

  @Column(name = "fluorescence", nullable = true, length = 50)
  String fluorescence;

  @Column(name = "description", nullable = true, length = 1000)
  String description;

  @Column(name = "price", nullable = true, precision = 18, scale = 2)
  BigDecimal price;

  @ManyToOne
  @JoinColumn(name = "account_id")
  Account accountId;

  @ManyToOne
  @JoinColumn(name = "accessment_id")
  DiamondAssessment assessId;

  @ManyToOne
  @JoinColumn(name = "order_id")
  Order orderId;
}
