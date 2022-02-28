## 包装类
```text
-Java语言为每一个内置数据类型提供了对应的包装类
-所有的包装类（Integer,Long,Byte,Double,Float,Short）都是抽象类Number的子类
-这种由编辑器特别支持的包装称为装箱，所以当内置数据类型被当作对象使用的时候，编译器会把内置类型装箱为包装类,
  相似的，编译器也可以把一个对象拆箱为内置类型。Number类属于java.lang包
```

## Math类
```text
-Math的方法都被定义为static形式，通过Math类可以在主函数中直接调用
    -Math.floor是向下取整
    -Math.ceil是向上取整
    -Math.round是四舍五入取整，但是有以下注意事项
        1.参数小数点后第一位等于5时，正数运算结果为整数部分+1，负数的运算结果为整数部分
```