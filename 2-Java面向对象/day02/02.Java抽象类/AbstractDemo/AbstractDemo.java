abstract class AbsDemoAbstract { // 这是一个抽象类
    public AbsDemoAbstract() {
        System.out.println("Abs构造器");
    }
    public abstract void getName(); //这是一个抽象方法
}

//class Test { // 测试一个有抽象方法的非抽象类能不能编译通过（必定不行）
//    public abstract void sayHistory();
//}

class A extends AbsDemoAbstract {
    String name;
    public void sayNmae(String name) {
        System.out.println("A说他的名字是：" + name);
    }
    public void setName(String name) {
        this.name = name;
    }
    public void getName() {
        System.out.println("我获取到的名字是" + name);
    }
}

class B extends A {
    String name;
    public void sayNmae(String name) {
        System.out.println("A的孩子B说他的名字是：" + name);
        this.name = name;
        System.out.println("B还表示这个名字不咋地！！！");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        // AbsDemoAbstract abc = new AbsDemoAbstract(); // 报错，抽象类无法被实例化
        A a = new A();
        A b = new B();
        a.sayNmae("jack");
        a.setName("小猪佩奇");
        a.getName();
        System.out.println("===================");
        b.sayNmae("大头儿子");
    }
}