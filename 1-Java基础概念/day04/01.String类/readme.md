```text
-String类有11中构造方法，这些方法提供不同的参数来初始化字符串，比如提供一个字符串数组
-注意：String类是不可改变的，所以一旦创建了String对象，那么它的值就无法改变了
-如果需要对字符串做很多修改，那么应该选择使用StringBuffer & StringBuilder 类
```

## 字符串长度
```text
-用于获取有关对象的信息的方法称为访问器方法
-String类的一个访问器方法是length()方法，返回字符串对象包含的字符数
```

## 连接字符串
```text
-String类提供了两个连接字符串的方法
    1.concat()方法，String1.concat(String2);
    2.常用的是使用“+”操作符来连接字符串
```

## 创建格式化字符串
```text
-String类使用静态方法format()返回一个String对象而不是PrintStream对象
-String类的静态方法format()能用来创建可复用的格式化字符串，而不仅仅是用于一次打印输出
```

## String方法
```text
-char charAt(int index):
-int compareTo(Object o):
-int compareTo(String anotherString):
-int compareToIgnoreCase(String str):
-String concat(String str):
-boolean contentEquals(StringBuffer sb):
-static String copyValueOf(char[] data):
-static String copyValueOf(char[] data, int offset, int count):
-boolean endsWith(String suffix):
-boolean equals(Object anObject):
-boolean equalsIgnoreCase(String anotherString):
-byte[].getBytes():
-byte[].getBytes(String charsetName):
-void getCharts(int srcBegin, int srcEnd, char[] dst, int dstBegin):
-int hashCode():
-int indexOf(String str):
-int indexOf(String str, int fromIndex):
-String intern():
-int lastIndexOf(int ch):
-int lastIndexOf(int ch, int fromIndex):
-int lastIndexOf(String str):
-int lastIndexOf(String str, int fromIndex):
-int length():
-boolean matches(String regex):
-boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len):
-boolean regionMatches(int toffset, String other, int ooffset, int len):
-String replace(char oldChar, char newChar):
-String replaceAll(String regex, String replacement):
-String replaceFirst(String regex, String replacement):
-String[] split(String regex):
-String[] split(String regex, int limit):
-boolean startsWith(String prefix):
-boolean startsWith(String prefix, ony toffset):
-CharSequence subSequence(int beginIndex, int endIndex):
-String substring(int beginIndex):
-String substring(int beginIndex, int endIndex):
-char[] toCharArray():
-String toLowerCase():
-String toLowerCase(Locale locale):
-String toString():
-String toUpperCase():
-String toUpperCase(Locale locale):
-String trim():
-static String valueOf(primitive data type x):
-contains(CharSequence chars):
-isEmpty():
```