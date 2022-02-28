class SuperClass {
    private int n;
    SuperClass() {
        System.out.println("SuperClass()");
    }
    SuperClass(int n) {
        System.out.println("SuperClass(int n)");
        this.n = n;
    }
}

// SubClass继承
class SubClass extends SuperClass {
    private int n;

    // 自动调用父类的无参构造器
    SubClass() {
        System.out.println("SubClass");
    }

    public SubClass(int n) {
        // 调用父类中带有参数的构造器
        super(300);
        System.out.println("SubClass(int n):" + n);
        this.n = n;
    }
}

// SubClass2类继承
class SubClas2 extends SuperClass {
    private int n;
    // 调用父类中带有参数的构造器
    SubClas2() {
        super(300);
        System.out.println("SubClass2");
    }

    // 自动调用父类中的无参构造器
    public SubClas2(int n) {
        System.out.println("SubClass2(int n):" + n);
        this.n = n;
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        System.out.println("------------SubClass 类继承----------------");
        SubClass sc1 = new SubClass();
        SubClass sc2 = new SubClass(100);
        System.out.println("------------SubClass2 类继承----------------");
        SubClas2 sc3 = new SubClas2();
        SubClas2 sc4 = new SubClas2(200);
    }
}