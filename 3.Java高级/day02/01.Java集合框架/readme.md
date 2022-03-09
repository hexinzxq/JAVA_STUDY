### 集合框架被设计成满足以下几个目标
- 该框架必须是高性能的，基本集合（动态数组，链表，树，哈希表）的实现也必须是高效的
- 该框架允许不同类型的集合，以类似的方式工作，具有高度的互操作性
- 对一个集合的扩展和适应必须是简单的
- 为此，整个集合框架就围绕一组标准接口而设计，我们可以直接使用这些接口的标准实现


- Java结合框架主要包括两种类型的容器，一种是集合（Collection），存储一个元素集合，另一种是图（Map）
  ，存储值键/值对映射。Collection接口又有三种子类型，List、Set、和Queue，再下面是一些抽象类，最后
  是具体实现类，常用的有ArrayList,LinkedList,HashSet,LinkedHashSet,HashMap,LinkedHashMap等


### 集合框架是用来代表和操纵集合的统一架构，所有集合框架都包含以下内容
- 接口：是代表集合的抽象数据类型，例如Collection、List、Set、Map等，之所以定义多个接口，是为了
  以不同的方式操作集合对象
- 实现（类）：是集合接口的具体实现，从本质上讲，他们是可重复使用的数据结构，例如：ArrayList、
  LinkedList、HashSet、HashMap
- 算法：是实现集合接口对象里的方法执行的一些有用的计算，例如：搜索和排序，这些算法被称为多态，那是
  因为相同的方法可以在相似的接口上有着不同的实现
![]()- 除了集合，该框架也定义了几个Map接口和类。Map里存储的是键/值对，尽管Map不是集合，但是它们
  完全整合在集合中
- Java集合框架提供了一套性能优良，使用方便的接口和类，java集合框架位于java.util包中，所以
  使用集合框架的时候都需要进行导包


### 集合接口
- 集合框架定义了一些接口，几个接口的概述如下
```text
1.Collection接口：
    -Collection是最基本的集合接口，一个Collection代表一组Object，即Collection的元素
    -Java不提供直接继承自Collection的类，只提供继承于的子接口（如List和Set）
    -Collection接口存储一组不唯一，无序的对象
2.List接口
    -List接口是一个有序的Collection，使用此接口能精确控制每个元素插入的位置，能够通过索引（元素
      在List中位置，类似于数组下标）来访问List中元素，第一个元素索引为0，允许有相同元素
    -List接口存储一组不唯一，有序（插入顺序）的对象
3.Set
    -Set具有与Collection完全一样的接口，只是行为上不同，Set不保存重复的元素
    -Set接口存储一组唯一，无序的对象
4.SortedSet
    -继承于Set保存有序的集合
5.Map
    -Map接口存储一组键值对像，提供key到value的映射
6.Map.Entry
    -描述一个在Map中的一个元素（键值对），是一个Map的内置接口
7.SortedMap
    -继承于Map，使Key保持在升序排列
8.Enumeration
    -这是一个传统的接口和定义的方法，通过它可以枚举（一次获得一个）对象集合中的元素，这个
      传统接口已被迭代器取代
```
### Set和List的区别
1. Set接口存储的是无序的，不重复的数据，List接口实例存储的是有序的，可以重复的元素
2. Set检索效率低下，删除和插入效率高，插入和删除不会引起元素位置改变<实现类有HashSet，TreeSet>
3. List和数组类似，可以动态增长，根据实际存储的数组长度自动增长List的长度。查找元素效率高，插入
   删除效率低，因为会引起其它元素位置改变<实现类有ArrayList，LinkedList，Vector>

### 集合实现类（集合类）
- Java提供了一套实现了Collection接口的标准集合类，其中一些是具体类，这些类可以直接拿来使用，
  而另外一些是抽象类，提供了接口的部分实现

### 集合算法
- 集合框架定义了几种算法，可用于集合和映射，这些算法被定义为集合类的静态方法
- 在尝试比较不兼容的类型时，一些方法能够抛出ClassCastException异常
- 当试图修改一个不可修改的集合时，抛出UnsupportedOperationException异常
- 集合定义三个静态的变量：EMPTY_SET,EMPTY_LIST,EMPTY_MAP的，这些变量都不可改变
```text
Collection Algorithms ，这里是一个列表中所有算法实现
```

### 如何使用迭代器
- 一般遍历数组都是采用for循环或增强for循环，这两个方法也可以用在集合框架
- 但是还有一种方法是采用迭代器遍历集合框架，它是一个对象，实现了Iterator接口或ListIterator接口
- 迭代器，使能通过循环来得到或删除集合的元素，ListIterator继承了Iterator，以允许双向遍历列
  表和修改元素

### 迭代器
- 迭代器iterator的两个基本操作使next、hasNext和remove
- 调用iterator.next()会返回迭代器的下一个元素，并且更新迭代器的状态
- 调用iterator.hasNext()用于检测集合中是否还有元素
- 调用iterator.remove()将迭代器返回的元素删除
- Iterator位于java.util包中，使用前需要进行引入
- 例子: 见IteratorDemo.java
```java
import java.util.Iterator;
```

### 遍历ArrayList，见例子：ArrayListDemo.java

### 遍历Map， 见例子MapDemo.java

### 如何使用比较器
- TreeSet和TreeMap的按照排序顺序来存储元素，然而，这是通过比较器来精确定义按照什么样的排序顺序
- 这个接口可以让我们以不同的方式来排序一个集合
```text
使用Java Comparator
这里通过实例列出Comparator接口提供的所有方法
```

## 总结
- Java集合框架为程序员提供了预先包装的数据结构和算法来操纵他们
- 集合是一个对象，可容纳其它对象的引用，集合接口声明对每一种类型的集合可以执行的操作
- 集合框架的类和接口均在java.util包中
- 任何对象加入集合类后，自动转换为Object类型，所以在取出的时候，需要进行强制类型转换