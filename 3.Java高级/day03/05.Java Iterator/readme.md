- Java Iterator(迭代器)不是一个集合，它是一种用于访问集合的方法，可用于迭代ArrayList  
  和HashSet等集合
- Iterator是Java迭代器最简单的实现，ListIterator是Collection API中的接口，它扩展  
  了Iterator接口
- 迭代器it的两个基本操作是next,hasNext和remove
- 调用it.next()会返回迭代器的下一个元素，并且更新迭代器状态
- 调用it.hasNext()用于检测集合中是否还有元素
- 调用it.remove()将迭代器返回元素删除
- Iterator类位于java.util包中，使用前需要引入它

 ## 获取一个迭代器
- 要获取一个迭代器使用iterator()方法
- 例子： 见IteratorDemo