## 从控制台读取字符串
```text
-从标准输入读取一个字符串需要使用BufferedReader的readLine（）方法
```

## 控制台输出
```text
-控制台输出由print()和println()完成，这些方法都由类PrintStream定义，System.out是该类对象的一个引用
-PrintStream继承了OutputStream类，并且实现了方法write()，这样，write()也可以用来往控制台写操作
-PrintStream定义write()的最简单格式： void write(int byteval);,该方法把byteval的低八位字节写到流中
-write()方法不经常使用
```

## 读写文件
### FileInputStream
```text
-该流用于从文件读取数据，它的对象可以用关键字new创建
-有多种构造方法可用来创建对象
-可以使用字符串类型的文件名来创建一个输入流对象来读取文件
    InputStream f = new FileInputStream("C:/java/Hello");
-也可以用一个文件对象来创建一个输入流对象来读取文件，首先得使用File()方法创建一个文件对象
    File f = new File("C:/java/Hello");
    InputStream in = new FileInputStream(f);
-创建了InputStream对象，就可以使用以下方法来读取流或者进行其它流的操作
    1.public void close() throws IOException{} // 关闭此文件输入流并释放与此流有关的所有系统资源，抛出IOException异常
    2.protected void finalize() throws IOException{} // 此方法清除与该文件的连接。确保不再引用文件输入流时调用其close()方法，抛出IOException异常
    3.public int read(int r) throws IOException{} // 从InputStream对象读取指定字节的数据，返回为整数值，返回下一字节数据，如已到结尾返回-1
    4.public int read(byte[] r) throws IOException{} // 从输入流读取r.length长度的字节，返回读取的字节数，如果是文件结尾返回-1
    5.public int available() throws IOException{} // 返回下一次对此输入流调用的方法可以不受阻塞地从此输入流读取的字节数，返回一个整数值
    
-除了InputStream外，还有一些其他的输入流：ByteArrayInputStream、DataInputStream等
```

## FileOutputStream
```text
-该类用来创建一个文件并向文件中写数据
-如果该流在打开文件进行输出前，目标文件不存在，那么该流会创建该文件
-有两个构造方法可以用来创建FileOutputStream对象，
    1.使用字符类型的文件名来创建一个输出流对象：
        OutputStream f = new FileOutputStream("C:/java/hello");
    2.也可使用一个文件对象来创建一个输出流来写文件，首先要使用File()方法来创建一个文件对象
        File f = new File("C:/java/hello");
        OutputStream fOut = new FileOutputStream(f);
-创建OutputStream对象完成后，就可以使用以下方法来写入流或进行其它流操作
    1.public void close() throws IOException{} // 关闭此文件输入流并释放与此流相关的所有系统资源，抛出IOException异常
    2.protected void finalize() throws IOException{} // 清除与该文件的连接，确保在不再引用文件输入流时调用其close方法
    3.public void write(int w) throws IOException{} // 将指定的字节写到输出流中
    4.public void write(byte[] w) // 将指定数组中w.length长度的字节写到OutputStream中
-除了OutputStream外，还有一些其他的输出流，如：ByteArrayOutputStream、DataOutputStream等
```

## 文件和I/O
### Java中的目录
#### 创建目录
```text
File类中有两个方法可以用来创建文件夹
    -mkdir()方法创建一个文件夹，成功返回true，失败则false，失败表明File对象指定的路径已经存在，或者
     由于整个路径还不存在，该文件夹不能被创建
    -mkdirs()方法创建一个文件夹和它的所有父文件夹
```

#### 读取目录
```text
-一个目录其实就是一个File对象，它包含其它文件和文件夹
-如果创建一个File对象并且它是一个目录，那么调用isDirectory()方法会返回true
-可以通过调用该对象上的list()方法，来提取它包含的文件和文件夹的列表
```

#### 删除目录或文件
```text
-删除文件可以使用java.io.File.delete()方法
-注意：当删除某一目录时，必须保证该目录下没有其它文件才能正确删除，否则将删除失败
```