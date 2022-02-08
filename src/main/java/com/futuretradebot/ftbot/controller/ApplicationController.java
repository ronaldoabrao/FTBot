package com.futuretradebot.ftbot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ApplicationController {

  @GetMapping(value="/")
  public String getMethodName() {
      return "Future Trade Bot!";
  }
  
}
