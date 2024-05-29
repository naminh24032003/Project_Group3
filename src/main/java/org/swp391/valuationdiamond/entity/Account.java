package org.swp391.valuationdiamond.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.Date;
import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "tbl_Account")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Account {
  @Id
  @Column(name = "account_id", nullable = false, length = 255)
  String accountId;

  @Column(name = "first_name", nullable = true, length = 255)
  String firstName;

  @Column(name = "last_name", nullable = true, length = 255)
  String lastName;

  @Column(name = "birthday", nullable = true)
  Date birthday;

  @Column(name = "phone_number", nullable = true, length = 20)
  String phoneNumber;

  @Column(name = "email", nullable = true, length = 100)
  String email;

  @Column(name = "address", nullable = true, length = 255)
  String address;

  @Column(name = "password", nullable = true, length = 20)
  String password;

  @Column(name = "role", nullable = true, length = 50)
  @Enumerated(EnumType.STRING)
  Role role;

  @OneToMany(mappedBy = "accountId", cascade = CascadeType.ALL)
  List<EvaluationResult> evaluationResults;

  @OneToMany(mappedBy = "accountId", cascade = CascadeType.ALL)
  List<EvaluationRequest> evaluationRequests;

  @OneToMany(mappedBy = "accountId", cascade = CascadeType.ALL)
  List<OrderDetails>  orderDetails;

  @OneToMany(mappedBy = "accountId", cascade = CascadeType.ALL)
  List<CommittedPaper> committedPapers;



}
