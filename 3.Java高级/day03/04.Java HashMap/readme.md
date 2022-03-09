- HashMap是一个散列表，它的存储内容是键值对（key-value）映射
- HashMap实现了Map接口，根据键的HashCode值存储数据，具有很快的访问速度，最多允许一条记录  
  的键为null，不支持线程同步
- HashMap是无序的，即不会记录插入的顺序
- HashMap继承于AbstractMap，实现了Map,Cloneable,java.io.Serializable接口
- HashMap的key与value类型可以相同也可以不同，可以是字符串类型的key和value，也可以是整型的key  
  和字符串类型的value
```text
Map<String, String> map = Map.of("google", "google.com", "baidu", "baidu.com");
  - key:"google", value:"google.com"; key:"baidu", value:"baidu.com"
```
- HashMap中的元素实际上是对象，一些常见的基本类型可以使用它的包装类
- HashMap类位于java.util包中，使用前需要引入它
- 以下示例创建一个HashMap对象sites，整型的key和字符串类型的value
```text
HashMap<Integer, String> sites = new HashMap<Integer, String>();
```

## 添加元素
- 添加键值对（key-value）可以使用put()方法
- 例子见HashMapDemo

## 访问元素
- 使用get(key)方法来获取key对应的value
- 例子见HashMapDemo

## 删除元素
- 使用remove(key)删除key对应的键值对（key-value）
- 删除所有键值对可以用clear()方法
- 例子见HashMapDemo

## 计算大小
- 使用size()方法
- 例子见HashMapDemo

## 迭代
- 可以使用for-each来迭代其中的元素
- 如果指向获取key，可以使用keySet()方法，然后可以通过get(key)获取对应的value，如果  
  只想取value，可以使用values方法
- 例子见HashMapDemo

## HashMap常用方法
- 见：<https://www.runoob.com/java/java-hashmap.html>