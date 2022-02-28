import java.io.File;

public class DirList {
    public static void main(String[] args) {
        String dirName = "/Java";
        File f1 = new File(dirName);
        if (f1.isDirectory()) {
            System.out.println("目录:" + dirName);
            String s[] = f1.list();
            for (int i = 0; i < s.length; i++) {
                File f = new File(dirName + "/" + s[i]);
                if (f.isDirectory()) {
                    System.out.println(s[i] + "是一个目录");
                } else {
                    System.out.println(s[i] + "是一个文件");
                }
            }
        } else {
            System.out.println(dirName + "不是一个目录");
        }
    }
}