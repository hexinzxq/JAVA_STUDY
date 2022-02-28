import java.io.File;
/* 注意：Java在UNIX和Windows自动按约定分辨文件路径分隔符，如果在Windows版本的Java中使用分隔符(/)，路径依然能够被正确解析 */
public class CreateDir {
    public static void main(String[] args) throws Exception {
        String dirName = "/tmp/usr/java/bin";
        File dir = new File(dirName);
        dir.mkdirs();
    }
}