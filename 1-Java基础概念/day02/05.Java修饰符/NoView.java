public class NoView {
    public int a = 100;
    private static int numInstance = 0;
    protected static int getCount() {
        return numInstance;
    }
    private static void addInstance() {
        numInstance++;
        a++; // 编译报错，不能在静态的方法中使用类的非静态变量！
    }
    NoView() {
        NoView.addInstance();
    }
    public void calNum() {
        numInstance++;
    }
    public static void main(String[] args) {
        System.out.println("Start with" + NoView.getCount() + "instances");
        for (int i = 0; i < 500; ++i) {
            new NoView();
        }
        System.out.println("Created" + NoView.getCount() + "instances");
        NoView n1 = new NoView();
        n1.calNum();
        System.out.println("修改后的numInstance是：" + numInstance);
        System.out.println("修改后的a是：" + a);
    }
}