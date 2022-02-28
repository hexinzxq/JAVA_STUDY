## Java 流（Stream）、文件（File）、IO
```text
-java.io 包几乎包含了所有操作输入输出需要的类，所有这些流类代表了输入源和输出目标
-java.io 包中的流支持很多格式，比如：基本类型、对象、本地化字符集等等
-一个流可以理解为一个数据的序列，输入流表示从一个源读取数据，输出流表示向一个目标写数据
-Java为I/O提供了强大而灵活的支持，使其更广泛地应用到文件传输和网络编程中
```

## 读取控制台输入
```text
-Java的控制台输入由System.in完成
-为了获得一个绑定到控制台的字符流，可以把System.in包装在一个BufferedReader对象中来创建一个字符流
-创建BufferedReader的基本语法如下：
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
-BufferedReader对象创建后，我们便可以使用read()方法从控制台读取一个字符，或者用readLine()方法读取一个字符串
```

## 从控制台读取多字符输入
```text
-从BufferedReader对象读取一个字符要使用read()方法，语法如下
    int read() throws IOException
-每次调用read方法，它从一个输入流读取一个字符并把该字符作为整数值返回，当流结束的时候返回-1，该方法抛出IOException
```

## 从控制台读取字符串
```text
-从标准输入读取一个字符串需要使用BufferedReader的readLine方法
```