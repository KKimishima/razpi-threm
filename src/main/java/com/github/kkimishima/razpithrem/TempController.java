package com.github.kkimishima.razpithrem;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TempController {
  @RequestMapping(value = "/api/v1/temp", method = RequestMethod.GET)
  public String GetTemp(
      @RequestParam("id") String id,
      @RequestParam("datetime") String datetime,
      @RequestParam("temp") String temp
  ) {
    System.out.println("get :" + id + ":" + datetime +":"+temp );

    return "OK";

  }
}
