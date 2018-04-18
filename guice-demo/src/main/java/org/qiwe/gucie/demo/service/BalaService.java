package org.qiwe.gucie.demo.service;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class BalaService {

  @Inject
  private ThirdHelloService helloService;

  @Inject
  private void init() {
    System.out.println("init");
  }

  public void sayHello() {
    System.out.println("bualbual call hello");
    helloService.sayHello();
  }

  public void run(){
    new Thread(() -> {
      System.out.println("Thread call hello");
      helloService.sayHello();
    }).start();
  }

}
