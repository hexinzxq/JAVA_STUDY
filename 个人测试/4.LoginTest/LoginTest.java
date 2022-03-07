import java.util.Scanner;
import java.io.*;

public class LoginTest {
    public static String username = "qqq";
    public static String password = "qweasdzxc";
    public static void checkInfo(String username, String password) {
        if (LoginTest.username == username && LoginTest.password == password) {
            System.out.println("login success!!");
        } else {
            System.out.println("login Failed! Please check your username or password!");
        }
    }

    public static void checkInfo2() {
        String username = "";
        String password = "";
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("plaease input your username:");
            if (sc.hasNext()) {
                username = sc.next();
            }
            System.out.println("plaease input your password:");
            if (sc.hasNext()) {
                password = sc.next();
            }
            System.out.println("current userneme:" + username + ",current password:" + password);
            if ((LoginTest.username.equals(username)) && (LoginTest.password.equals(password))) {
                System.out.println("login success!!");
                break;
            } else {
                System.out.println("login Failed! Please check your username or password!");
            }
        }
        sc.close();
    }
    public static void main(String[] args) {
        checkInfo("qqq", "qweasdzxc");
        checkInfo2();
    }
}