namespace java com.dxz.thrift.demo
 
service  HelloWorldService {
  void ping(),
  void sayHello(),
  string sayHelloByName(1:string username)
}
