```text
-Java提供的数组是用来存储固定大小的同类型元素
```

## 声明数组变量
```text
-必须声明数组变量，才能在程序中是使用数组，语法：
    dataType[] arrayRefVar; //首选     ----double[] myList;
    dataType arrayRefVar； //效果相同，但是不是首选方法    ----double myList[];
```

## 创建数组
```text
-Java语言中使用new操作符来创建数组，语法
    arrayRefVar = new dataType[arraySize];    -----myList = new double[10];
    这句代码做了两件事：1.使用dataType[arrSize]创建了一个数组，2.将新创建的数组的引用赋值给变量arrayRefVar
-数组变量的声明和创建数组可以用一条语句完成，如下
    dataType[] arrayRefVar = new dataType[arrSize];
-另外，还可以用以下方式创建数组
    dataType[] arrayRefVar = {value0, v1, v2, ...};
-数组的元素是通过索引访问的，数组索引从0开始，所以索引值从0到arrayRefVar.length  - 1
```

## 处理数组
```text
-数组的元素类型和数组的大小都是确定的，所以当处理数组元素时候，通常使用基本循环或者For-Each循环
```

## For-Each循环
```text
-JDK1.5加入了一种新的循环类型，被称为For-Each循环或者加强型循环，它能在不使用下标的情况下遍历数组
    语法：for(type element: array){
        System.out.println(element);
    }
```

## 数组作为函数的参数
```text
-数组可以作为参数传递给方法
```

## 数组作为函数的返回值
```text

```

## 多维数组

## Arrays类
```text
-java.utils.Arrays类能方便地操作数组，它提供的所有方法都是静态的
-具有以下功能
    1.给数组赋值，通过fill方法
    2.对数组排序，通过sort方法，按升序
    3.比较数组，通过equals方法比较数组中元素值是否相等
    4.查找数组元素，通过binarySearch方法能对排序好的数组进行二分查找法操作
```