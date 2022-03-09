import java.util.Iterator;
import java.util.ArrayList;

public class IteratorDemo {
    public static void main(String[] args) {
        // 创建集合
        ArrayList<String> list = new ArrayList<String>();
        list.add("beijing");
        list.add("shanghai");
        list.add("guangdog");
        list.add("sichuan");

        // 获取迭代器
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            // 删除元素
            if(it.next().equals("shanghai")) {
                it.remove();
            }
            System.out.print(it.next() + ",");
        }
    }
}