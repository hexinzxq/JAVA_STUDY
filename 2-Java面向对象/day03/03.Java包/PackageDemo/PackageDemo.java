package normalPackage;

public class PackageDemo implements Test{
    public void run() {
        System.out.println("在该类中实现了接口中的run方法");
    }
    public static void main(String[] args) {
        PackageDemo p = new PackageDemo();
        p.run();
    }
}