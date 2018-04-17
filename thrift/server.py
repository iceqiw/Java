import sys
sys.path.append('./gen-py')
 
from demoHello import HelloWorldService
from demoHello.ttypes import *
from demoHello.constants import *


from thrift.transport import TSocket
from thrift.transport import TTransport
from thrift.protocol import TBinaryProtocol
from thrift.server import TServer
 
import socket

class HelloWorldHandler:
  def __init__(self):
    self.log = {}

  def ping(self):
    print("ping()")

  def sayHello(self):
    print("sayHello()")

  def sayHelloByName(self, username):
    return username

handler = HelloWorldHandler()
processor = HelloWorldService.Processor(handler)
transport = TSocket.TServerSocket('127.0.0.1',9090)
tfactory = TTransport.TBufferedTransportFactory()
pfactory = TBinaryProtocol.TBinaryProtocolFactory()

server = TServer.TSimpleServer(processor, transport, tfactory, pfactory)

print("Starting python server...")
server.serve()
