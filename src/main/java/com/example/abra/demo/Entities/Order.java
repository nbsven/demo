package com.example.abra.demo.Entities;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "order_table")
public class Order {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "order_id")
  private Long id;

  @ManyToOne
  @JoinColumn(name = "consumer_id")
  private Consumer consumer;

  private LocalDate date;

  @OneToMany(mappedBy = "order")
  private List<Product> products;

  @ManyToOne
  @JoinColumn(name = "store_id")
  private Store store;

  private Long cost;
}
