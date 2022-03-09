import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        // 创建HashMap对象1sites
        HashMap<Integer, String> sites = new HashMap<Integer, String>();
        // 创建HashMap对象2sites2
        HashMap<String, String> sites2 = new HashMap<String, String>();
        // 添加键值对：put()方法
        sites.put(1, "beijing");
        sites.put(2, "shanghai");
        sites.put(3, "guangdong");
        sites.put(4, "shenzheng");
        sites2.put("one", "beijing");
        sites2.put("two", "shanghai");
        sites2.put("three", "guangdong");
        sites2.put("four", "shenzheng");
        System.out.println(sites); // {1=beijing, 2=shanghai, 3=guangdong, 4=shenzheng}
        System.out.println(sites2); // {four=shenzheng, one=beijing, two=shanghai, three=guangdong}
        // get()方法获取key对应的value
        System.out.println(sites.get(2)); // shanghai
        // remove()方法删除键值对
        sites2.remove("three");
        System.out.println("删除后的sites2： " + sites2);
        // clear()方法删除所有键值对
        sites2.clear();
        System.out.println("清空后的sites2： " + sites2);
        // size()方法查看大小
        System.out.println("site的大小为： " + sites.size());
        // 迭代HashMap，获取key和value
        for (Integer i : sites.keySet()) {
            System.out.println("key= " + i + " value= " + sites.get(i));
        }
        // 返回所有value值
        System.out.println("所有的value值： " + sites.values());

        // 克隆一份sites
        HashMap<Integer, String> sitesClo = (HashMap<Integer, String>) sites.clone();
        System.out.println("克隆出来的sitesClo： " + sitesClo);
        System.out.println("克隆出来的sitesClo是否与sites相同： " + (sitesClo == sites));
    }
}