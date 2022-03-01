interface Animal {
    // public int a; // 编译不通过，由于接口中的变量都是隐式public static final类型，所以声明变量的时候必须要给定初始值
    public int animal = 10; // 正确声明形式
    public void eat();
    public void work();
}

interface Run {
    public void foots();
    // 默认方法（JDK1.8）：
    default void getInfo() {
        System.out.println("我是接口中的默认方法");
    }
    // 静态方法：
    static void getName() {
        System.out.println("我是接口中的静态方法");
    }
}

public class InterfaceDemo implements Animal, Run{
    public void eat() {
        System.out.println("动物吃");
    }
    public void work() {
        System.out.println("工作不划水");
    }
    public void foots() {
        System.out.println("这个动物有四条腿跑路");
    }
    public static void main(String[] args) {
        InterfaceDemo id = new InterfaceDemo();
        id.eat();
        id.work();
        id.foots();
        Run.getName(); // 接口中的静态方法只能通过接口名来调用
        // Run.getInfo(); // 编译报错，接口中的默认方法只能接口实现类的对象来调用
        id.getInfo(); // 调用接口中的默认方法
    }
}