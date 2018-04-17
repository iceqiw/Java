package com.ice.tech.gh.aisite.app.controller

import java.util.Date

import com.ice.tech.gh.aisite.app.service.DataService
import org.springframework.web.bind.annotation.{RequestMapping, RequestParam, RestController}

@RestController
class HelloController(val dataService: DataService) {

  @RequestMapping(Array("/hello"))
  def greeting(@RequestParam(value = "name", defaultValue = "LightSword") name: String) = {
    dataService.SayHello()
    val now = new Date
    val content = "Hello, " + name + "! Now is: " + now
    content

  }

}
