class Test {
    // 封装的体现，访问修饰符private
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Test t = new Test();
        t.setName("lily");
        t.setAge(20);
        System.out.println("name is:" + t.getName() + ", and the age is:" + t.getAge());
    }
}