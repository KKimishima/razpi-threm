package com.github.kkimishima.razpithrem.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "TEMPERATURA")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TempData {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column(nullable = false)
  private String no;

  @Column(nullable = false)
  private String datetime;

  @Column(nullable = false)
  private String temp;
}
