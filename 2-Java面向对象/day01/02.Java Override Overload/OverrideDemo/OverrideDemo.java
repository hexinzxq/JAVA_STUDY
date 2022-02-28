class Animal {
    public void move() {
        System.out.println("动物可以移动~~~~~~~~~");
    }
}

class Dog extends Animal {
    public void move() {
        // super.move();
        System.out.println("狗是可以跑的，跑了！！！");
    }
    public void eat() {
        System.out.println("狗是会吃吃吃的~~~~");
    }
}

public class OverrideDemo {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Dog();
        Dog d = new Dog();
        a.move();
        d.move();
        d.eat();
//        b.eat(); // 报错，编译错误，因为b的引用类型Animal没有bark方法
    }
}