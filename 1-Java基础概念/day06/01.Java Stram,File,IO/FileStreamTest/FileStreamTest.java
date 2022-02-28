import java.io.*;

/**
 * 此段代码输出乱码，因为是二进制写入的
 * 该段代码首先创建文件test.txt，并把给定的数字以二进制形式写入该文件，同时输出到控制台上
 * */

public class FileStreamTest {
    public static void main(String[] args) {
        try {
            // 创建test.txt,把给定的数字以二进制写入文件中
            byte bWriter[] = {11, 21, 3, 40, 5};
            OutputStream os = new FileOutputStream("test.txt");
            for (int x = 0; x < bWriter.length; x++) {
                os.write(bWriter[x]); // writes the bytes
            }
            os.close();

            // 读取文件，将文件信息输出到控制台上
            InputStream is = new FileInputStream("test.txt");
            int size = is.available();

            for (int i = 0; i < size; i++) {
                System.out.println((char) is.read());
            }
            is.close();
        } catch (IOException e) {
            System.out.println("Exception");
        }
    }
}