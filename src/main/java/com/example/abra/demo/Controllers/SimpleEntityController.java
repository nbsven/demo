package com.example.abra.demo.Controllers;

import com.example.abra.demo.Entities.SimpleEntity;
import com.example.abra.demo.Services.SimpleEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SimpleEntityController {

  private SimpleEntityService simpleEntityService;

  @Autowired
  public SimpleEntityController(
      SimpleEntityService simpleEntityService) {
    this.simpleEntityService = simpleEntityService;
  }

  @GetMapping(value = "/")
  public ModelAndView hello(@RequestParam(name = "name", defaultValue = "blablabla") String name,
      ModelAndView modelAndView) {
    SimpleEntity entity = new SimpleEntity(name);
    entity = simpleEntityService.createSimpleEntity(entity);

    System.out.println("blabla");
    modelAndView.addObject("id", entity.getId());
    modelAndView.addObject("name", entity.getName());
    modelAndView.setViewName("index");
    return modelAndView;
  }
}
