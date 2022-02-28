import java.io.*;
public class LeiVariable {
    // 静态的私有变量
    private static double salary;
    // 常量
    public static final String DEPARTMENT = "程序员";
    public static void main(String[] args) {
        LeiVariable v1 = new LeiVariable();
        salary = 100000;
        System.out.println(DEPARTMENT + "薪资" + salary);
        System.out.println("v1S" + v1.salary);
        System.out.println("v1D" + v1.DEPARTMENT);
    }
}