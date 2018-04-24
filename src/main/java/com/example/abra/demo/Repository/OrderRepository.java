package com.example.abra.demo.Repository;

import com.example.abra.demo.Entities.Consumer;
import com.example.abra.demo.Entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
