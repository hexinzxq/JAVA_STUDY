- HashSet基于HashMap来实现的，是一个不允许有重复元素的集合
- HashSet允许有null值
- HashSet是无序的，即不会记录插入的顺序
- HashSet不是线程安全的，如果多个线程尝试同时修改HashSet，则最终结果是不确定的，必须在多线程  
  访问时显示同步对HashSet的并发访问
- HashSet实现了Set接口
- HashSet中的元素实际上是对象，一些常见的基本类型可以使用它的包装类
- HashSet位于java.util包中，使用前需要引入它，语法格式如下
```java
import java.util.HashSet;
```

- HashSet的常见方法写法以及创建方式类似LinkedList，
- 详见<https://www.runoob.com/java/java-hashset.html>