package com.example.abra.demo.Services.Impl;

import com.example.abra.demo.Entities.SimpleEntity;
import com.example.abra.demo.Repository.SimpleEntityRepository;
import com.example.abra.demo.Services.SimpleEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SimpleEntityServiceImpl implements SimpleEntityService {

  private SimpleEntityRepository simpleEntityRepository;

  @Autowired
  public SimpleEntityServiceImpl(
      SimpleEntityRepository simpleEntityRepository) {
    this.simpleEntityRepository = simpleEntityRepository;
  }

  @Override
  public SimpleEntity createSimpleEntity(SimpleEntity entity) {
    return simpleEntityRepository.save(entity);
  }

  @Override
  public SimpleEntity getSimpleEntityById(Long id) {
    return simpleEntityRepository.getOne(id);
  }

  @Override
  public void deleteSimpleEntity(Long id) {
    simpleEntityRepository.deleteById(id);
  }
}
