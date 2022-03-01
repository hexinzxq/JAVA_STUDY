enum Color {
    RED, PINK, BLUE;
    // 构造函数
    private Color() {
        System.out.println("构造器打印:" + this);
    }
    public void colorInfo() {
        System.out.println("Universal color");
    }
}

public class EnumDemo2 {
    public static void main(String[] args) {
        Color c1 = Color.RED;
        System.out.println(c1);
        c1.colorInfo();
    }
}