#!/usr/bin/env python3
#coding: utf-8

import sys
sys.path.append('./gen-py')

from demoHello import HelloWorldService
from demoHello.ttypes import *
from demoHello.constants import *

from thrift import Thrift
from thrift.transport import TSocket
from thrift.transport import TTransport
from thrift.protocol import TBinaryProtocol

  # Make socket
socket = TSocket.TSocket('127.0.0.1', 9090)

#transport = TSocket.TSocket('127.0.0.1', 9090)

transport = TTransport.TFramedTransport(socket)
  # Buffering is critical. Raw sockets are very slow
transport = TTransport.TBufferedTransport(transport)

# Wrap in a protocol
protocol = TBinaryProtocol.TBinaryProtocol(transport)

# Create a client to use the protocol encoder
client = HelloWorldService.Client(protocol)
# Connect!
transport.open()

client.ping()

transport.close()
