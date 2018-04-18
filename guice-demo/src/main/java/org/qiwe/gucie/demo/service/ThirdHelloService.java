package org.qiwe.gucie.demo.service;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class ThirdHelloService {


  @Inject
  private HelloService helloService;

  public void sayHello() {
    System.out.println("call hello");
    helloService.sayHello();
  }

}
