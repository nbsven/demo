package com.example.abra.demo.Services;

import com.example.abra.demo.Entities.SimpleEntity;
import org.springframework.stereotype.Service;

public interface SimpleEntityService {

  SimpleEntity createSimpleEntity(SimpleEntity entity);

  SimpleEntity getSimpleEntityById(Long id);

  void deleteSimpleEntity(Long id);
}
