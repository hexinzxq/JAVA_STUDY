- ArrayList类是一个可以动态修改的数组。与普通的数组的区别就是它没有固定大小的限制，我们  
  可以添加或删除元素
- ArrayList继承了AbstractList，并实现了List接口
- ArrayList类位于java.util包中，使用前需要引入
```java
import java.util.ArrayList; // 引入该类
ArrayList<E> objectName = new ArrayLisy<>(); // 初始化
// E：泛型数据类型，用于设置 objectName 的数据类型，只能为引用数据类型
// objectName： 对象名
```
- ArrayList是一个数组队列，提供了相关的添加，删除，修改，遍历等功能


## 添加元素
- ArrayList类提供了很多有用的方法，添加元素到ArrayList可以使用add()方法
- 例子： ArrayListDemo1
## 访问元素
- 访问ArrayList中的元素可以使用get()方法
- 例子： ArrayListDemo1
## 修改元素
- 修改需要使用set()方法
- 例子： ArrayListDemo1
## 删除元素
- 删除需要使用remove()方法
- 例子： ArrayListDemo1
## 计算大小
- 计算其中的元素数量使用size()方法
- 例子： ArrayListDemo1
## 迭代数组列表
- 使用for或for-each
- 例子： ArrayListDemo1
## 其他的引用类型
- 如果需要存储除String之外的其它数据类型，由于<E>只能为引用数据类型，所以就需要使用到基本类型  
  的包装类：Boolean，Short，Byte，Integer，Long，Float，Double，Character
- 此外，BigInteger，BigDecimal用于高精度的运算，BigInteger支持任意精度的整数，也是引用类型  
  ，但是他们没有相对应的基本数据类型

## ArrayList排序
- Collections类也是一个非常有用的类，位于java.util包中，提供的sort方法可以对字符或数字列表  
  进行排序
- 例子： ArrayListDemo1

## Java ArrayList方法
- 详见： [Java ArrayList常用方法](https://www.runoob.com/java/java-arraylist.html)