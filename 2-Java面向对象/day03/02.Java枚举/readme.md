## Java枚举
- Java枚举是一个特殊的类，一般表示一组常量，比如一年的4个季节，一年的12个月份，一周七天等
- Java枚举使用enum关键字来定义，各个常量使用，来分割
- 例如定义一个颜色的枚举类
```java
enum Color {
    RED, BLUE, YELLOW;
}
```
- 使用实例
```java
enum Color {
    RED, BLUE, YELLOW;
}
public class Test {
    public static void main(String[] args) {
        Color c1 = Color.RED;
        System.out.println(c1); // RED
    }
}
```
- 每个枚举都是通过Class在内部实现的，且所有枚举值都是public static final的
- 以上的枚举类Color转换在内部类实现
```java
class Color {
    public static final RED = new Color();
    public static final BLUE = new Color();
    public static final YELLOW = new Color();
}
```
- 迭代枚举元素，可以使用for语句
```java
enum Color {
    RED, BLUE, SKYBLUE;
}
public class MyClass {
    public static void main(String[] args) {
        for (color myVar : Color.values()) {
            System.out.println(myVar); // RED  BLUE SKYBLUE
        }
    }
}
```
- 在switch中使用枚举类
```java
enum Color {
    RED, BLUE, SKYBLUE;
}
public class MyClass {
    public static void main(String[] args) {
        Color myVar = Color.BLUE;
        switch (myVar) {
            case RED:
                System.out.println("红色");
            break;
            case BLUE:
                System.out.println("蓝色"); // 打印这个
            break;
            case SKYBLUE: 
                System.out.println("天蓝");
            break;
        }
    }
}
```

### values(), ordinal()和valueOf()方法
- enum定义的枚举类默认继承了java.lang.Enum类，并实现了java.lang.Serializable和
  java.lang.Comparable两个接口
- values(),ordinal()和valueOf()方法位于java.lang.Enum类中
```text
1.values()返回枚举类中的所有值
2.ordinal()方法可以找到每个枚举常量的索引，就像数组索引一样
3.valueOf()方法返回指定字符串值的枚举常量
详见EnumDemo.java
```

### 枚举类成员
- 枚举跟普通类一样可以用自己的变量、方法和构造函数，构造函数只能使用private访问修饰符，
  所以外部无法调用
- 枚举既可以包含具体方法，也可以包含抽象方法。如果枚举类包含抽象方法，则枚举类的每个实例
  都必须实现它（例子见EnumDemo2.java）
