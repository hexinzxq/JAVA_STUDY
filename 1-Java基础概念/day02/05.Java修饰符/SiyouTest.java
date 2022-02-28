public class SiyouTest {
    public static void main(String[] args) {
        Siyou s1 = new Siyou();
        s1.setFormat("666啊，来读private！");
        System.out.println("读取主类的format为：" + s1.getFormat());
        System.out.println("读取主类的name为：" + s1.name);
        System.out.println("读取主类的a为：" + s1.a);
    }
}