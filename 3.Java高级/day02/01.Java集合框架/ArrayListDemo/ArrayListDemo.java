import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.add("ulugulu");

        /**
         * 以下三种方法都是用来遍历ArrayList集合，第二种方法采用的使迭代器的方式，该方法可以不用担心在遍历的过程中会超出集合长度
         * */

        // 第一种遍历方法（for循环）
        for (String item : list) {
            System.out.println("我是其中一句话: " + item);
        }

        // 第二种遍历方法（迭代器）
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println("我是迭代器遍历出来的一句话： " + it.next());
        }

        // 第三种遍历方法（将链表变为数组相关内容进行遍历）
        String[] strArray = new String[list.size()];
        list.toArray(strArray);
        for (String item : list){
            System.out.println("我是变成数组后遍历出来的一句话： " + item);
        }
    }
}