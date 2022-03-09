import java.util.ArrayList;
import java.util.Collections; // 引入Collections类

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("shanghai");
        sites.add("beijing");
        sites.add("nanjing");
        // System.out.println("最终的sites：" + sites); // [shanghai, beijing, nanjing]
        // System.out.println(sites.get(1)); // 访问第二个元素 beijing
        sites.set(2, "sichuan"); // 第一个参数为需要改变的索引， 第二个是需要改变的内容
        System.out.println("改变后的sites：" + sites); // 改变后的sites：[shanghai, beijing, sichuan]
        sites.remove(0); // 传需要删除的索引 [beijing, sichuan]
        System.out.println("删除后的sites：" + sites);
        // 计算元素数量
        System.out.println("这个ArrayList元素数量有: " + sites.size() + " 个"); // 2个
        Collections.sort(sites); // 排序
        // 遍历展示
        for (String site : sites) {
            System.out.println("城市单个：" + site);
        }
    }
}