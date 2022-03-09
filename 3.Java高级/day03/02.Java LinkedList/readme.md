- 链表（Linked list）是一种常见的基础数据结构，是一种线性表，但是并不会按线性顺序存储数据，  
  而是在每一个节点里存到下一个节点的地址
- 链表可以分为单向链表和双向链表
- 一个单向链表包含两个值，当前节点的值和指向下一个节点的链接
- 一个双向链表有三个整数值：数值、向后的节点链接，向前的节点链接
- Java LinkedList（链表）类似于ArrayList，是一种常见的数据容器
- 与ArrayList相比，LinkedList的增加和删除的操作效率更高，而查找和修改的操作效率较低

#### 以下情况使用ArrayList：
- 频繁访问列表中的某一个元素
- 只需要在列表末尾进行添加和删除元素操作
#### 以下情况使用LinkedList
- 需要通过循环迭代来访问列表中的某些元素
- 需要频繁的在列表开头、中间、末尾等位置进行添加和删除元素操作

****

- LinkedList继承了AbstractSequentialList类
- LinkedList实现了Queue接口，可作为队列使用
- LinkedList实现了List接口，可进行列表的相关操作
- LinkedList实现了Deque接口，可以作为队列使用
- LinkedList实现了Cloneable接口，可以实现克隆
- LinkedList实现了java.io.Serializable接口，即可支持序列化，能通过序列化去传输
- LinkedList类位于java.util包中，使用前需要引入它，语法格式如下
```java
import java.util.LinkedList; // 引入
public class Test {
    public static void main(String[] args) {
        LinkedList<E> list = new LinkedList<E>(); // 普通创建方法
        
        LinkedList<E> list = new LinkedList(Collection<? extends E> c); // 使用集合创建链表
    }
}
```
- 几个常见方法见例子LinkedListDemo
- 常用方法见：[LinkedList常用方法](https://www.runoob.com/java/java-linkedlist.html)