```text
-java.util.Scanner是Java5的新特征，可以通过Scanner类来获取用户的输入
-基本语法
    Scanner s = new Scanner(System.in);
-ScannerDemo文件和ScannerDemo2演示了一个最简单的数据输入，并通过Scanner类的next()和nextLine()方法获
  取输入的字符串，在读取前我们一般需要使用hasNext与hasNextLine判断是否还有输入的数据
```

## next()和nextLine()的区别
```text
-next():
    1.一定要读取到有效字符串后才可以结束输入
    2.对输入字符之前遇到的空白，next()方法会自动将其去掉
    3.只有输入有效字符后才将其后面输入的空白作为分隔符或结束符
    4.next()不能得到带有空格的字符串
-nextLine():
    1.以Enter为结束符，也就是说nextLine()方法返回的是输入回车之前的所有字符
    2.也可以得到空白
-如果要输入int或float类型的数据，在Scanner类中也有支持，但在输入前最好先使用hasNextXxx()方法进行验证，
  再使用nextXxx()来读取
  
```
