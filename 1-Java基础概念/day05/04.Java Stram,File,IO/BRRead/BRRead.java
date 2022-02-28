// 使用BufferReader在控制台读取字符
import java.io.*;

public class BRRead {
    public static void main(String[] args) throws IOException{
        String c;
        // 使用system.in创建BufferReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符，按下'q'退出");
        // 读取字符
        do {
        c = br.readLine();
        System.out.println(c);
        } while (!c.equals("exit"));
    }
}