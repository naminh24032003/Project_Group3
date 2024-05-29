package org.swp391.valuationdiamond.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "tbl_Ratings")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Ratings {

  @Id
  @Column(name = "rating_id", nullable = false)
  Long ratingId;

  @Column(name = "user_id", nullable = true, length = 255)
  String userId;

  @Column(name = "blog_id", nullable = true, length = 50)
  String blogId;

  @Column(name = "rating", nullable = true)
  int rating;
}
