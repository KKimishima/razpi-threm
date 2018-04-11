package com.github.kkimishima.razpithrem.service;

import com.github.kkimishima.razpithrem.domain.TempData;
import com.github.kkimishima.razpithrem.repository.TempRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class TempDataService {
  @Autowired
  TempDataService tempDataService;

  public List<TempData> findAll(){
    return tempDataService.findAll();
  }

  public TempData seve(TempData tempData){
    return tempDataService.seve(tempData);
  }

  public List<TempData> LastDate(){
    return tempDataService.LastDate();
  }
}
