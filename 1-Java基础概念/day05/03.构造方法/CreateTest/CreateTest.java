public class CreateTest {
   public int a;
    CreateTest(int b, int c) {
        a = 10;
        System.out.println("转换前：b=" + b + ",c=" + c);
        int temp = b;
        b = c;
        c = temp;
        System.out.println("转换后：b=" + b + ",c=" + c);
    }
    public static void main(String[] args) {
        CreateTest c = new CreateTest(2, 3);
        System.out.println("a=" + c.a);
    }
}