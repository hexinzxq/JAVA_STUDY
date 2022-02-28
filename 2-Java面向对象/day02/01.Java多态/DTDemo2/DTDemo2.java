public class DTDemo2 {
    public static void main(String[] args) {
        show(new Cat());
        show(new Dog());
        System.out.println("+++++++++++++++++++");
        Animal an = new Cat();  //向上转型
        an.eat();
        Cat ca = (Cat) an; //向下转型
        ca.work();
    }

    public static void show(Animal a) {
        a.eat();
        // 类型判断
        if (a instanceof Cat) {  // 猫做的事情
            Cat c = (Cat) a;
            c.work();
        } else if (a instanceof Dog) { // 狗做的事情
            Dog d = (Dog) a;
            d.work();
        }
    }
}

abstract class Animal {
    abstract void eat();
}

class Cat extends Animal {
    public void eat() {
        System.out.println("吃鱼猫");
    }
    public void work() {
        System.out.println("猫抓老鼠");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("狗吃狗粮");
    }
    public void work() {
        System.out.println("看家狗");
    }
}