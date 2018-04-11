package com.github.kkimishima.razpithrem.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
  @RequestMapping(value = "/")
  public String index(){
    return "index";
  }
}
