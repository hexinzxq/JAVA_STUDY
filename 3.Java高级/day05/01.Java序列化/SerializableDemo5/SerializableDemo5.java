import java.io.*;
import java.util.*;

@SuppressWarnings("unchecked")
class Studet implements java.io.Serializable{
    public String name;
    public int age;
    public transient int id;
    public Studet(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
        System.out.println("Constructor  " + "my name is: " + name + ", my age is: " + age + ", and my id is: " + id);
    }
}

@SuppressWarnings("unchecked")
public class SerializableDemo5 {
    public static void main(String[] args) {
        // 创建一个用于保存学生信息的集合
       List<Studet> list = new ArrayList<>();
       //向集合中添加Student对象
        list.add(new Studet("joker", 18, 1));
        list.add(new Studet("lily", 19, 2));
        list.add(new Studet("parker", 20, 3));
        // 开始写文件，序列化
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/tmp/demo.txt"));
            oos.writeObject(list);
            oos.close();
        }catch (IOException e) {
            e.printStackTrace();
        }

        // 读取文件信息到控制台，反序列化
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/tmp/demo.txt"));
            List<Studet> list2 = (List<Studet>) ois.readObject();
            for (Studet item : list2) {
                System.out.println("student info: " + item);
            }
            // 释放资源
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        } catch (ClassNotFoundException e) {
            System.out.println("Studet calss not found");
            e.printStackTrace();
            return;
        }
    }
}