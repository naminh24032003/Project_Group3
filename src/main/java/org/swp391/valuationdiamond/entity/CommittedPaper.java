package org.swp391.valuationdiamond.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Entity
@Table(name = "tbl_Committed_Paper")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CommittedPaper {

  @Id
  @Column(name = "committed_id", nullable = false, length = 255)
  String committedId;

  @Column(name = "comitted_name", nullable = true, length = 255)
  String committedName;

  @Column(name = "committed_date", nullable = true)
  Date committedDate;

  @Column(name = "civil_id", nullable = true, length = 255)
  String civilId;

  @ManyToOne
  @JoinColumn(name = "account_id")
  Account accountId;

  @ManyToOne
  @JoinColumn(name = "order_id")
  Order orderId;
}
