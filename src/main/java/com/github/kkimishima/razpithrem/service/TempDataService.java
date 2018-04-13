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
  TempRepository tempRepository;

  public List<TempData> LastData() {
    return tempRepository.findLastDate();
  }

  public List<TempData> FindAll() {
    return tempRepository.findAll();
  }

  public TempData SaveDate(TempData tempData) {
    return tempRepository.save(tempData);
  }
}
