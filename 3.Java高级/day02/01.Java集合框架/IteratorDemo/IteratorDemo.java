import java.util.Iterator;
import java.util.ArrayList;

public class IteratorDemo {
    public static void main(String[] args) {
        // 创建集合
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Baidu");
        sites.add("xiaomi");
        sites.add("huawei");
        sites.add("google");

        // 获取迭代器
        Iterator<String> it = sites.iterator();

        // 输出集合中的第一个元素
//        System.out.println(it.next());

        // 输出剩下的所有元素
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }

        while (it.hasNext()) {
            String i  = it.next();
            if (i.equals("Baidu")) {
                it.remove(); // 删除字符串为”Baidu的元素
            }
        }
        System.out.println("===========" + sites);
    }
}