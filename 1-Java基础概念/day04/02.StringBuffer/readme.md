# Java StringBuffer和StingBuilder类
```text
-当对字符串进行修改的时候，需要使用StringBuffer和StringBuilder类
-和String类不同的是，StringBuffer和StringBuilder类的对象能被多次修改，并且不产生新的未使用对象
-在使用StringBuffer类是，每次都会对StringBuffer对象本身进行操作，而不是生成新对象，所以如果需要对字符串进行更改，推荐使用StringBuffer
-StringBuilder类在Java5中被提出，和StringBuffer之间的最大不同在于StringBuilder的方法不是线程安全的（不能同步访问）
-由于StringBuilder相较于StringBuffer有速度优势，所以多数情况下使用StringBuilder类
-然而在应用程序要求线程安全的情况下，那么必须使用StringBuffer类
```

## StringBuffer方法
```text
-public StringBuffer append(String s):
-public StringBuffer reverse():
-public delete(int start, int end):
-public insert(int offset, int i):
-insert(int offset, String str):
-replace(int start, int end, String str):
```

## StringBuilder方法
```text
-int capacity():
-char charAt(int index):
-void getChars(int srcBegin, int srcEnd, char[] dist, int dstBegin):
-void ensureCapacity(int minimumCapacity):
-int indexOf(String str):
-int indexOf(String str, int fromIndex):
-int lastIndexOf(String str):
-int lastIndexOf(String str, int fromIndex):
-int length():
-void setCharAt(int index, char ch):
-void setLength(int newLength):
-CharSequence subSequence(int start, int end):
-String substring(int start):
-String substring(int start, int end):
-String toString():
```