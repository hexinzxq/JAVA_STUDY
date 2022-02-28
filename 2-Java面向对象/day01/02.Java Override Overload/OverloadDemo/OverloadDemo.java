public class OverloadDemo {
    public void test(int i) {
        System.out.println("i的值是：" + i);
    }
    public void test(String s, char c) {
        System.out.println("String的值是:" + s);
        System.out.println("Char的值是:" + c);
    }
    public void test(Boolean b) {
        System.out.println("Boolean的值是：" + b);
    }

    public static void main(String[] args) {
        OverloadDemo od = new OverloadDemo();
        od.test("学习学习", 'A');
        od.test(true);
    }
}