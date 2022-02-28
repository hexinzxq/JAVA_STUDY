import java.io.*;

public class EmpTest {
    public static void main(String[] args) {
        Employee empOne = new Employee("test01");
        Employee emptTwo = new Employee("test02");

        empOne.empAge(10);
        empOne.empDesignation("程序猿");
        empOne.empSalary(80000);
        empOne.printEmployee();

        emptTwo.empAge(20);
        emptTwo.empDesignation("程序猿111");
        emptTwo.empSalary(400);
        emptTwo.printEmployee();
    }
}