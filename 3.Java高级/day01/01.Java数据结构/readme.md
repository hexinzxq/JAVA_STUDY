## Java数据结构
> Java工具包提供了强大的数据结构，在Java中的数据结构主要包括以下几种接口和类
> > 1.枚举（Enumeration）  
> > 2.位集合（BitSet）  
> > 3.向量（Vector）  
> > 4.栈（Stack）  
> > 5.字典（Dictionary）  
> > 6.哈希表（Hashtable）  
> > 7.属性（Properties）
> 以上这些类是传统遗留的，在Java2中引入了一种新的框架-集合框架（Collection）  

## 枚举
- 枚举接口虽然它本身不属于数据结构，但它在其它数据结构的范畴里应用很广。枚举接口定义了一种从数据  
  结构中取回连续元素的方式
- 例如，枚举定义了一个叫nextElement的方法，该方法用来得到一个包含多元素的数据结构的下一个元素
```text
-Enumeration接口中定义了一些方法，通过这些方法可以枚举（一次获得一个）对象集合中的元素
-这种传统接口已被迭代器取代，虽然Enumeration还没被遗弃，但在现代代码中已经很少使用的了。
  尽管如此，它还是使用在诸如Vector和Properties这些传统类所定义的方法中，除此之外，还用在
  一些API类，并且在应用程序中也广泛被使用，以下是一些Enumeration的方法
```

- boolean hasMoreElements() : 测试此枚举是否包含更多的元素
- Object.nextElement(): 如果此枚举对象至少还有一个可提供元素，则返回此枚举的下一个元素
- 见例子EnumerationDemo.java

## 位集合（BitSet）
- 位集合类实现了一组可以单独设置和清除的位或标志
- 该类在处理一组布尔值的时候非常有用，只需要给每一个值赋值一“位”，然后对位进行适当的设置或清除  
  就可以对布尔值进行操作了
- 一个Bitset类创建一种特殊类型的数值来保存位值，BitSet中数组大小会随需要增加，这和位向量比较  
  类似
- 这是一个传统的类，在Java2中被完全重新设计
- BitSet定义了两个构造方法：第一个是创建一个默认的对象，第二个方法允许用户指定初始大小，所有位  
  初始化为0
- BitSet实现了Cloneable接口中定义的方法见<https://www.runoob.com/java/java-bitset-class.html>

## 向量（Vector）
- 向量和传统数组非常相似，但是Vector的大小能根据需要动态的变化
- 和数组一样，Vector对象的元素也能通过索引访问
- 使用Vector类最主要的好处就是在创建对象的时候不必给对象指定大小，它的大小会根据需要动态变化
- Vector类实现了一个动态数组，和ArrayList很相似，但是两者是不同的
    - Vector是同步访问的
    - Vector包含许多传统的方法，这些方法不属于集合框架
- Vector主要用在事先不知道数组的大小，或者只是需要一个可以改变大小的数组的情况
- Vector类支持4种构造方法
    - 第一种创建一个默认的向量，默认大小为10   Vector()
    - 第二种是在创建时指定大小 Vector(int size)
    - 第三种是在创建时指定大小，并且增量用incr指定，增量表示向量每次增加的元素数目 Vector(int size, int incr)
    - 第四种构造方法创建用一个包含集合c元素的向量 Vector(Collection c)
- 除从父类继承的方法外Vector还定义了以下方法，见 <https://www.runoob.com/java/java-vector-class.html>
- 详见`VectorDemo.java`

## 栈（Stack）
- 栈实现了一个后进先出（LIFO）的数据结构
- 可以把栈理解为对象的垂直分布的栈，当添加一个新元素时，就将新元素放在其它元素的顶部
- 当从栈中取元素的时候，就从栈顶取一个元素。换句话说，最后进栈的元素最先被取出
- Java Stack类
    - 栈是Vector的一个子类，它实现了一个标准的后进先出的栈
    - 堆栈只定义了默认构造函数，用来创建一个空栈。堆栈除了包括由Vector定义的所有方法，也  
      定义了一些自己的方法Stack()
    - 方法见<https://www.runoob.com/java/java-stack-class.html>
    - 例子：`StackDemo.java`

## 字典(Dictionary)
- 字典（Dictionary）类是一个抽象类，它定义了键映射到值的数据结构
- 当需要通过特定的键而不是整数索引来访问数据的时候，这时候就应当使用Dictionary
- 由于Dictionary类是抽象类，所以它只提供了键映射到值的数据结构，而没有提供特定的实现
- Dictionary类是一个抽象类，用来存储键/值对，作用和Map类相似
- 给出键和值，就可以将值存储在Dictionary对象中。一旦该值被存储，就可以通过它的键来获取他
- 所以和Map一样，Dictionary也可以作为一个键/值对列表
- Dictionary定义的抽象方法见<https://www.runoob.com/java/java-dictionary-class.html>
- Dictionary类已经过时了，在实际开发中，可以实现Map接口来获取键/值的存储功能

### Java Map接口
- Map接口中键和一一映射，可以通过键来获取值
- 给定一个键和一个值，可以将该值存储在一个Map对象，之后，可以通过键来访问对应的值
- 当访问的值不存在的时候，方法就会抛出一个NoSuchElementException异常
- 当对象的类型和Map里元素的类型不兼容的时候，就会抛出一个ClassCastException异常
- 当在不允许使用Null对象的Map中使用Null对象，会抛出一个NullPointerException异常
- 当尝试修改一个只读的Map时，会抛出一个UnsupportedOperationException异常
- 具体方法见<https://www.runoob.com/java/java-map-interface.html>
- 例子：`CollectionsDemo.java`

## 哈希表（Hashtable）
- Hashtable类提供了一种用户在定义键结构的基础上来组织数据的手段
- 例如，在地址列表的哈希表中，可以根据邮件编码作为键来存储和排序数据，而不是通过人名
- 哈希表键的具体含义完全取决于哈希表的使用情况和它包含的数据
- Hashtable是原始java.util的一部分，是一个Dictionary具体的实现
- 然而，java2的重构的Hashtable实现了Map接口，因此，Hashtable现在集成到了集合框架中，它和  
  HashMap类很相似，但是他支持同步
- 像HashMap一样，Hashtable在哈希表中存储键/值对。当使用一个哈希表，要指定用作键的对象，以及  
  要链接到该键的值
- 然后，该键经过哈希处理，所得到的散列码被用作存储在该表中值的索引
- Hashtable定义了四个构造方法
    - 第一个是默认构造方法 Hashtable()
    - 第二个创建指定大小的哈希表 Hashtable(int size)
    - 第三个创建一个指定大小的哈希表，并通过fillRatio指定填充比例，填充比例必须介于0.0  
      和1.0之间，它决定了哈希表在重新调整大小之前的充满程度 Hashtable(int size, float fillRatio)
    - 第四个方法创建一个以M中元素为初始化元素的哈希表，哈希表的容量被设置为M的两倍  
      Hashtable(Map m)
- 除了从Map接口中定义的方法，其余方法见<https://www.runoob.com/java/java-hashTable-class.html>
- 例子： 见HashTableDemo.java


## 属性（Properties）
- Properties继承于Hashtable.Properties类，表示了一个持久的属性集，属性列表中每个键及其对应值都是一个字符串
- Properties类被许多Java类使用。例如：在获取环境变量时它就作为System.getProperties()方法的返回值
- Properties定义如下实例变量，这个变量持有一个Properties对象相关的默认属性列表
```java
Properties defaults;
```
- Properties类定义了两个构造方法，第一个构造方法没有默认值 Properties()
- 第二个构造方法使用propDefault作为默认值。两种情况下，属性列表都为空 Properties(Properties propDefault)
- 除了从Hashtable中所定义的方法，其余方法见<https://www.runoob.com/java/java-properties-class.html>
- 例子见： PropDemo.java

