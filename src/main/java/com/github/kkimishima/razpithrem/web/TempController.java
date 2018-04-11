package com.github.kkimishima.razpithrem.web;

import com.github.kkimishima.razpithrem.domain.TempData;
import com.github.kkimishima.razpithrem.repository.TempRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class TempController {
  @Autowired
  TempRepository tempRepository;

  @RequestMapping(value = "/temp", method = RequestMethod.POST)
  public TempData SaveTemp(@Validated @RequestBody TempData tempData) {
    return tempRepository.save(tempData);
  }

  @RequestMapping(value = "/temp",method = RequestMethod.GET)
  public List<TempData> GetAllTemp(){
    return tempRepository.findAll();
  }
  @RequestMapping(value = "/temp/last",method = RequestMethod.GET)
  public List<TempData> GetLastTemp(){
    return tempRepository.findLastDate();
  }
}
