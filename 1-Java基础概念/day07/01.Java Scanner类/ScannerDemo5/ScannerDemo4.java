import java.io.*;

public class ScannerDemo4 {
    public static void main(String[] args) {
       Console console = System.console();
       String username = console.readLine("UserName:");
       char[] password = console.readPassword("Password");
        System.out.println("用户名：" + username);
        System.out.println("密码：" + password);
    }
}