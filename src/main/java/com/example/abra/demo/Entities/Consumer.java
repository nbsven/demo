package com.example.abra.demo.Entities;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Builder
@Data
@ToString(exclude = {"orders"})
@EqualsAndHashCode(exclude = {"orders"})
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "consumer")
public class Consumer {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "consumer_id")
  private Long id;

  @Column(name = "consumer_login")
  private String login;

  @Column(name = "consumer_password")
  private String password;

  @Column(name = "consumer_balance")
  private Long balance;

  @OneToMany(cascade = CascadeType.ALL, mappedBy = "consumer")
  private List<Order> orders;

}
