package com.example.abra.demo.Repository;

import com.example.abra.demo.Entities.SimpleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SimpleEntityRepository extends JpaRepository<SimpleEntity, Long> {

}
