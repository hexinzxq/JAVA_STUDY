import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("apple");
        list.add("bananer");
        list.add("pear");
        list.add("polo");
        System.out.println("初始的list: " + list);
        list.addFirst("orange"); // 在列表开头添加元素
        System.out.println("开头添加orange之后的list： " + list);
        list.addLast("mango"); // 在结尾增加元素
        System.out.println("在结尾增加元素后的list： " + list);
        list.removeFirst(); // 移除列表开头的元素
        System.out.println("移除开头元素后的list： " + list);
        list.removeLast(); // 移除结尾的元素
        System.out.println("移除结尾的元素后的list：" + list);
        System.out.println("头部元素是： " + list.getFirst()); // 获取头部元素
        System.out.println("结尾元素是： " + list.getLast()); // 获取结尾元素
        // 方式1遍历list
        int a = 0;
        for (int i = 0; i < list.size(); i++) {
            a++;
            System.out.println("遍历方式1的第" + a + "个元素是： " + list.get(i));
        }
        int b = 0;
        for (String li : list) {
            b++;
            System.out.println("遍历方式2的第" + b + "个元素是： " + li);
        }
    }
}