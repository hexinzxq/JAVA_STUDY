- Java提供了一种对象序列化机制，该机制中，一个对象可以被表示为一个字节序列，该字节序列  
  包括该对象的数据、有关对象的类型的信息和存储在对象中数据的类型
- 将序列化对象写入文件之后，可以从文件中读取出来，并且对它进行反序列化。也就是说，对象的类型信息  
  、对象的数据，还有对象中的数据类型可以用来在内存中新建对象
- 整个过程都是Java虚拟机（JVM）独立的，在一个平台上序列化的对象可以在另一个完全不同的平台  
  上反序列化该对象
- 类ObjectInputStream和ObjectOutputStream是高层次的数据流，他们包含反序列化和序列化对象的方法
- ObjectOutputStream类包含很多方法来写各种数据类型，但是一个特别的方法例外
```text
public final void writeObject(Object x) throws IOException

- 该方法序列化一个对象，并将他发送到输出流，相似的ObjectInputStream类包含如下反序列化一个
  对象的方法
public final Object readObject() throws IOException, ClassNotFoundException

-该方法从六种取出下一个对象，并将对象反序列化，它的返回值为Object，因此，需要将它转换为合适的数据
 类型
 
 -见例子SerializeDemo1
```
- 注意： 一个类的对象想要序列化成功，必须要满足两个条件
    - 该类必须实现java.io.Serializable接口
    - 该类的所有属性必须是可序列化的，如果有一个属性不是可序列化的，则该属性必须注明是短暂的（transient）
- 如果想要知道一个类是否可序列化，可以看该类文档。检验一个类是否能序列化十分简单，只需要看该类有没有  
  实现java.io.Serializable接口

## 序列化对象
- ObjectOutputStream类用来序列化一个对象
- 注意：当序列化一个对象到文件时，按照Java的标准约定是给文件一个`.ser`的扩展名
- 见例子SerializableDemo2

## 反序列化对象
- 见例子SerializableDemo3
- 需要注意以下要点：
    - readObject()方法中的try/catch代码块尝试捕获ClassNotFoundException异常。对于JVM可以  
      反序列化对象，它必须是能够找到字节码的类
    - 如果JVM在反序列化对象的过程中找不到类，则抛出一个ClassNotFoundException异常
    - 注意： readObject()方法的返回值被转化成SerializeDemo1引用
    - 当对象被序列化时，属性SSN的值为66，但是因为该属性是短暂的，该值没有被发送到输出流，所以反  
      序列化后SerializeDemo1对象的SSN属性为0