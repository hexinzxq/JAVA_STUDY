class AnimalFather {
    String name;
    int id;
    public AnimalFather(String name, int id) {
        this.name = name;
        this.id = id;
        System.out.println("创建了一个对象，名字是:" + name + ",id是:" + id);
    }
    public void eat () {
        System.out.println(this.name + "正在胡吃海喝！！！");
    }
    public void sleep () {
        System.out.println(this.name + "正在摸鱼睡大觉！！！");
    }
    public void intrduction () {
        System.out.println("大家好，我叫：" + this.name + "，我的个人id是：" + this.id);
    }
}

// 企鹅类
class Penguing extends AnimalFather {
    public Penguing(String myName, int myId) {
        super(myName, myId);
    }
}

// 老鼠类
class Mouse extends AnimalFather {
    public Mouse(String myName, int myId) {
        super(myName, myId);
    }
}

// 企鹅孩子
class PenguingChild extends Penguing {
    public PenguingChild(String name, int id) {
        super(name, id);
    }
}

public class Animal {
    public static void main(String[] args) {
        AnimalFather af = new AnimalFather("cat-lily", 2);
        af.eat();
        af.sleep();
        af.intrduction();
        System.out.println("==============无情分割线，接下来是企鹅类==================");
        Penguing pg = new Penguing("小企鹅66", 8);
        pg.eat();
        System.out.println("==============无情分割线，接下来是老鼠类==================");
        Mouse mu = new Mouse("老鼠jack", 99);
        mu.intrduction();
        System.out.println("==============无情分割线，接下来是企鹅孩子类==================");
        PenguingChild pc = new PenguingChild("企鹅孩子bride", 9);
    }
}