import java.util.*;

@SuppressWarnings("unchecked")  // 加这行解决由于“ E扩展已在类 Vector中声明的Object”无法编译通过的问题
public class VectorDemo {
    public static void main(String[] args) {
        Vector v = new Vector(3, 2); //第二个参数是在第一个参数（基础空间大小）达到之后，每次容量的增加个数
        // 返回此向量中的组件数
        System.out.println("intial size:" + v.size()); // 0
        // 返回此向量的当前容量
        System.out.println("initial capacity: " + v.capacity()); // 3
        // 将指定的组件添加到此向量的末尾，将其大小增加1
        v.addElement((Integer) 1);
        v.addElement((Integer) 2);
        v.addElement((Integer) 3);
        v.addElement((Integer) 4);
        System.out.println("capacity after four: " + v.capacity()); // 5

        // v.addElement(new Double(4.5)); //此写法是过时了的，因为包装类自动装包拆包的原因，用下面的写法
        v.addElement((Double) 4.45);
        System.out.println("current capacity:" + v.capacity()); // 5

        v.addElement((Double) 12.35);
        System.out.println("current capacity:" + v.capacity()); // 7

        if(v.contains((Integer) 3)) {
            System.out.println("Vector contains 3!!");
        }

        Enumeration vEnumeration = v.elements();
        System.out.println("Elements in ventor");
        while (vEnumeration.hasMoreElements()) {
            System.out.print(vEnumeration.nextElement() + " ");
        }
    }
}