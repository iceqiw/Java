package org.qiwe.gucie.demo.module;

import com.google.inject.Binder;
import com.google.inject.Module;
import org.qiwe.gucie.demo.service.HelloService;
import org.qiwe.gucie.demo.service.ThirdHelloService;

public class HelloModule implements Module {

  @Override
  public void configure(Binder binder) {
    binder.bind(ThirdHelloService.class);
  }
}
