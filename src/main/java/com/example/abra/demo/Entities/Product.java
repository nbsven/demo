package com.example.abra.demo.Entities;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "product")
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "product_id")
  private Long id;

  private String name;

  private Long cost;

  @ManyToOne
  @JoinColumn(name = "order_id")
//  @Column(name = "order_product")
  private Order order;

  @ManyToOne
  @JoinColumn(name = "storage_id")
  private Storage storage;

  @ManyToOne
  @JoinColumn(name = "store_id")
  private Storage store;

}
