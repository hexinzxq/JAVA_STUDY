```text
-java.util包提供了Date类来封装当前的日期和时间，Date类提供两个构造函数来实例化Date对象
-第一个构造函数使用当前日期和时间来初始化对象
    Date()
-第二个构造函数接收一个参数，该参数是从1970年1月1日起的毫秒数
    Date(long millisec)
```

## Date对象创建后，可以使用以下的方法
```text
-boolean after(Date date): 若调用此方法的Date对象在指定日期之后，返回true，否则false
-boolean before(Date date):若调用此方法的Date对象在指定日期之前，返回true，否则false
-Object clone():返回此对象的副本
-int compareTo(Date date)：比较当调用此方法的Date对象和指定日期，两者相等时返回0，调用对象在指定日治之前返回负数，在之后返回正数
-int compareTo(Object obj):若obj是Date类型则操作等同于compareTo(Date)，否则将抛出ClassCastException
-boolean equals(Object date)：当调用此方法的Date的对象和指定日期相等时返回true，否则返回false
-long getTime():返回自1970年1月1日00:00:00GMT以来，此Date对象表示的毫秒数
-int hashCode():返回此对象的hash码值
-void setTime(long time):用自1970年1月1日00:00:00GMT以后time毫秒数设置时间和日期
-String toString():把此Date对象转换为以下形式的String： day mon dd hh:mm:ss yyyy 其中day是一周中的某一天（周几）
```

## 获取当前的日期和时间
```text
-Java中获取当前的日期和时间很简单，使用Date对象的toString()方法来打印当前日期和时间
```

## 日期比较
```text
-Java使用以下三种方法来比较两个日期
    1.使用getTime()方法获取两个日期（自1970.1.1的毫秒值）,然后比较这两个值
    2.使用方法before(),after()和equals()
    3.使用compareTo()方法，它是由Compare接口定义的，Date类实现了这个接口
```

## 使用SimpleDateFormat格式化日期
```text
-SimpleDateFormat是一个以语言环境敏感的方式来格式化和分析日期的类，SimpleDateFormat允许选择任何用户自定义日期时间格式来运行
-SimpleDateFormat类有一些附加的方法，特别是parse()，它试图按照给定的SimpleDateFormat对象的格式化存储来解析字符串
```

## Java休眠（sleep）
```text
-sleep()使当前线程进入停滞状态（阻塞当前线程）,让出CPU的使用，目的是不让当前线程霸占该进程所获的CPU资源，以留一定时间给其他线程执行的机会
```

## Calendar类
```text
-Calendar类比Date类强大很多，而且实现方式上也比Date类要复杂一些
-Calendar类是一个抽象类，在实际使用时实现特定的子类的对象，创建对象的过程对我们来说是可见的，只需要使用getInstance方法就可以
```

### 创建一个代表系统当前日期的Calendar对象
```java
Calendar c = Calendar.getInstance();//默认是当前日期
```

### 创建一个指定日期的Calendar对象
```java
// 使用Calendar类代表特定的时间，需要首先创建一个Calendar的对象，然后再设定该对象中的年月日参数来完成
// 创建一个代表2022年2月21日的Calendar对象
Calendar c1 = Calendar.getInstance();
c1.set(2022, 2 - 1, 21);
```

### Calendar类对象字段类型

### Calendar对象信息的设置
```text
1.Set设置
    如： Calendar c1 = Calendar.getInstance();
    调用： public final void set(int year, int month, int date);
          c1.set(2022, 2, 21); // 将Calendar对象c1的年月日分别设置为2022，2，21
    利用字段类型设置
    如果只设定某个字段，例如日期的值，则可以使用如下set方法:
        public void set(int field, int value);
        // 把c1对象代表的日期设置为10号，其它所有数值会被重新计算
        c1.set(Calendar.DATE, 10);
        //把c1对象代表的年份设置为2023，其它所有值会被重新计算
        c1.set(Calendar.YEAR, 2023);
        其他字段属性set的意义以此类推
2.Add设置
    Calendar c2 = Calendar.getInstance();
    // 把c2对象的日期加上10，也就是c2表示的就是10天后的日期，其它所有数值会被重新计算
    c2.add(Calendar.DATE, 10);
    // 把c2对象的日期减去10，也就是c2表示的就是10天前的日期，其它所有数值会被重新计算
    c2.add(Calendar.DATE, -10);
    其他字段属性Add的意义以此类推
```

## GregorianCalendar类
```text
-Calendar类实现了公历日历，GregorianCalendar是Calendar类的一个具体实现
-Calendar的getInstance（）方法返回一个默认用当前的语言环境和时区初始化的GregorianCalendar对象，GregorianCalendar定义了
    两个字段： AD和BC，这是代表公历定义的两个时代
```