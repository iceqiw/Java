package org.qiwe.gucie.demo;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.qiwe.gucie.demo.module.HelloModule;
import org.qiwe.gucie.demo.service.BalaService;
import org.qiwe.gucie.demo.service.HelloService;
import org.qiwe.gucie.demo.service.ThirdHelloService;

public class GuiceApplication {

  public static void main(String[] args) {
    Injector injector = Guice.createInjector();
    BalaService thirdHelloService = injector.getInstance(BalaService.class);
    thirdHelloService.sayHello();
    System.out.println("--------------------------------------------------------");
    thirdHelloService.run();
  }
}
