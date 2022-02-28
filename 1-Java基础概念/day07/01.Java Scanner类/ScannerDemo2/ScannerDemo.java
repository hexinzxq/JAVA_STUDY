import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        // 从键盘接收数据
        Scanner scan = new Scanner(System.in);

        // next方式接收字符串
        System.out.println("next方式接收:");
        // 判断是否还有输入
        if (scan.hasNext()) {
            String str1 = scan.nextLine();
            System.out.println("输入的数据为:" + str1); // 这里只会输出所有的输入
        }
        scan.close();
    }
}