package com.github.kkimishima.razpithrem.repository;

import com.github.kkimishima.razpithrem.domain.TempData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TempRepository extends JpaRepository<TempData,Long> {
  @Modifying
  @Query("SELECT u FROM TempData u WHERE u.id = (SELECT MAX(u.id) FROM TempData u ) ")
  List<TempData> findLastDate();
}
