# Java网络编程
- 网络编程是指编写运行在多个设备（计算机）的程序，这些设备都可以通过网络连接起来
- java.net包中J2SE的API包含有类和接口，他们提供低层次的通信细节，可以直接使用这些类和接口，来  
  专注于解决问题，而不用关注通信细节
- java.net包中提供了两种常见的网络协议的支持
    - TCP：TCP(英语：Transmission Control Protocol， 传输控制协议)是一种面向连接的、可靠的  
      基于字节流的传输层通信协议，TCP层是位于IP层之上，应用层之下的中间层。TCP保障了两个应用程序  
      之间的可靠通信，通用语互联网协议，被称TCP/IP，
    - UDP: UDP（User Datagram Protocol，用户数据报协议），位于OSI模型的传输层。一个无连接的协议，  
      提供了应用程序之间要发送数据的数据报，由于UDP缺乏可靠性且属于无连接协议。所以应用程序必须  
      容许一些丢失、错误或重复的数据包
- 这里主要讨论以下两个主题
    - Socket编程：这是使用最广泛的网络概念，它已被解释的非常详细
    - URL处理：见<https://www.runoob.com/java/java-url-processing.html>

## Socket编程
- 套接字使用TCP提供了两台计算机之间的通信机制。客户端程序创建一个套接字，并尝试连接服务器的套接字
- 当连接建立时，服务器会创建一个Socket对象，客户端和服务器现在可以通过对Socket对象的写入和读取来
  进行通信
- java.net.Socket类代表一个套接字，并且java.net.ServerSocket类为服务器提供了一种来监听客户端
  。并与他们建立连接的机制

- 以下步骤在两台计算机之间使用套接字建立TCP连接时会出现
    - 服务器实例化一个SocketServer对象，表示通过服务器上的端口通信
    - 服务器调用ServerSocket类的accept()方法，该方法将一直等待，直到客户端连接到服务器上
      给定的端口
    - 服务器正在等待时，一个客户端实例化一个Socket对象，指定服务器名称和端口号来请求连接
    - Socket类的构造函数试图将客户端连接到指定的服务器和端口号，如果通信被建立，则在客户端
      创建一个Socket对象能够与服务器进行通信
    - 在服务器端，accept()方法返回服务器上一个新的socket引用，该socket连接到客户端的socket
- 连接建立后，通过使用I/O流再进行通信，每一个socket都有一个输入流和一个输出流，客户端的输出流
  连接到服务器端的输入流，而客户端的输入流连接到服务器端的输出流
- TCP是一个双向的通信协议，因此数据可以通过两个数据流在同一时间发送
- 以下是一些类提供的一套完整的有用的方法来实现socket

### ServerSocket类的方法
- 有四个构造方法见<https://www.runoob.com/java/java-networking.html>
- 创建非绑定服务器套接字，如果ServerSocket构造方法没有抛出异常，就意味着该应用程序已成功绑定
  到指定的端口，并且侦听客户端请求
- 一些ServerSocket类的常用方法
    - public int getLocalPort(): 返回此套接字在其上侦听的端口
    - public Socket accept() throws IOException: 侦听并接受到此套接字的连接
    - public void setSoTimeout(int timeout): 通过指定超时值启用/禁用SO_TIMEOUT,以毫秒为单位
    - public void bind(SocketAddress host, int backlog):将ServerSocket绑定到特定地址（IP地址和端口号）


### Socket类的方法
- java.net.Socket类代表客户端和服务器都用来相互沟通的套接字，客户端要获取一个Socket对象通过实例化，
  而服务器获得一个Socket对象则通过accept()方法的返回值
- Socket类有5个构造方法见<https://www.runoob.com/java/java-networking.html>
- 当Socket构造方法返回，并没有简单实例化了一个Socket对象，它实际上会尝试连接到指定的服务器端口

### inetAddress类的方法
- 这个类表示互联网协议（IP）地址

- Socket客户端实例见GreetingClient.java
- Socket服务端实例见GreetingServer.java
