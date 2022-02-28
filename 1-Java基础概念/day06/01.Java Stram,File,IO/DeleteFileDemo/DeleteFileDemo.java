import java.io.File;

public class DeleteFileDemo {
    public static void main(String[] args) {
        File folder = new File("/tmp/java");
        deleteFolder(folder);
    }

    // 删除文件及目录
    public static void deleteFolder(File folder) {
        File[] files = folder.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    deleteFolder(file);
                } else {
                    file.delete();
                }
            }
        }
        folder.delete();
    }
}