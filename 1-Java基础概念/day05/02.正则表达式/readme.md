### java.util.regex包主要包括以下三个类
```text
-Pattern类
    patten对象是一个正则表达式的编译表示，Pattern类没有公共的构造方法，要创建一个Pattern对象必须先调用其公共静态编译方法，
    它返回一个Pattern对象，该方法接受一个正则表达式作为它的第一个参数
-Matcher类
    Matcher对象是对输入字符串进行解释和匹配操作的引擎，与Pattern类一样，Matcher类也没有公共的构造方法，需要使用Pattern对象的
    matcher方法来获得一个Matcher对象
-PatternSyntaxException: PatternSyntaxException是一个非强制异常类，它表示一个正则表达式模式中的语法错误
```