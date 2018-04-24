package com.example.abra.demo.Repository;

import com.example.abra.demo.Entities.Consumer;
import com.example.abra.demo.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
