public class Viribles {
    /**
     * 源文件的声明规则如下：
     * 一个源文件中只能有一个public类
     * 一个源文件可以有多个非public类
     * 源文件的名称应该和public的类名保持一致
     * 如果一个类定义在某个包中，那么package语句应当在源文件首行
     * 如果源文件包含import语句，那么应该放在package语句和类定义之间，如果没有package语句，那么就放在源文件的最前面
     * import语句和package语句对源文件中定义的所有类都有效，在同一源文件中，不能给不同的类不同的包声明
     * */
    int dogAge;
    public Viribles(String name) {
        System.out.println("这条小狗名字是:" + name);
    }
    public void setAge(int age) {
        dogAge = age;
    }
    public int getDogAge() {
        System.out.println("狗的年龄为:" + dogAge);
        return dogAge;
    }
    public static void main(String[] args) {
        Viribles myPuppy = new Viribles("zuoxiaoin");
        myPuppy.setAge(200);
        myPuppy.getDogAge();
        System.out.println("当前小狗的年龄是:" + myPuppy.dogAge);
    }
}