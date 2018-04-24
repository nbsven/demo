package com.example.abra.demo.Entities;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
@Table(name = "storage")
public class Storage {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "storage_id")
  private Long id;

  private String address;

  @OneToMany(mappedBy = "storage")
  private List<Product> products;

  @ManyToMany
  @JoinTable(
      name = "storage_store",
      joinColumns = @JoinColumn(name = "storage_id"),
      inverseJoinColumns = @JoinColumn(name = "store_id"))
  private List<Store> stores;


}
