package org.swp391.valuationdiamond.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import java.util.Date;

@Entity
@Table(name = "tbl_Blog")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Blog {

  @Id
  @Column(name = "blog_id", nullable = false, length = 50)
  String blogId;

  @Column(name = "blog_title", nullable = false, length = 255)
  String blogTitle;

  @Column(name = "author", nullable = false, length = 255)
  String author;

  @Column(name = "blog_date", nullable = false)
  Date blogDate;
}
