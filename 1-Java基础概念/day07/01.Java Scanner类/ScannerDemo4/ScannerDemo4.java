import java.util.Scanner;

public class ScannerDemo4 {
    public static void main(String[] args) {
        System.out.println("请输入数字");
        Scanner scanner = new Scanner(System.in);

        System.out.println(scanner.hasNextDouble());
        System.out.println(scanner.nextLine());

        double sum = 0;
        int m = 0;

        while (scanner.hasNextDouble()) {
            double x = scanner.nextDouble();
            m = m + 1;
            sum = sum + x;
        }

        System.out.println(m + "个数的和为:" + sum);
        System.out.println(m + "个数的平均值为:" + (sum / m));
        scanner.close();
    }
}