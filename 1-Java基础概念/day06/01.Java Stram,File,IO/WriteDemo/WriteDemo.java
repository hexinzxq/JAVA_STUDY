// 用write()把字符“A”和紧跟着的换行符输出到屏幕
import java.io.*;

public class WriteDemo {
    public static void main(String[] args) {
        int b;
        b = 'A';
        System.out.write(b);
        System.out.write('\n');
    }
}