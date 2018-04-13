package com.github.kkimishima.razpithrem.web;

import com.github.kkimishima.razpithrem.domain.TempData;
import com.github.kkimishima.razpithrem.repository.TempRepository;
import com.github.kkimishima.razpithrem.service.TempDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class TempController {
  @Autowired
  TempDataService tempDataService;

  @RequestMapping(value = "/temp", method = RequestMethod.POST)
  public TempData SaveTemp(@Validated @RequestBody TempData tempData) {
    return tempDataService.SaveDate(tempData);
  }

  @RequestMapping(value = "/temp", method = RequestMethod.GET)
  public List<TempData> GetAllTemp() {
    return tempDataService.FindAll();
  }

  @RequestMapping(value = "/temp/last", method = RequestMethod.GET)
  public List<TempData> GetLastTemp() {
    return tempDataService.LastData();
  }
//  @RequestMapping(value = "/temp/reset",method = RequestMethod.GET)
//  public void RestTemp(){tempRepository.restDate();}
}
