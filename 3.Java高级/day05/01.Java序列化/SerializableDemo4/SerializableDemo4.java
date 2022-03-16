import java.io.*;
import java.util.Iterator;

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

public class SerializableDemo4 {
    public static void main(String[] args) {
        Studet st1 = new Studet("piker" ,18, 1);
        Studet st2 = new Studet("jojo.", 13 , 2);

        // 开始写文件，序列化
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/tmp/demo.ser"));
            oos.writeObject(st1);
            oos.writeObject(st2);
            oos.close();
        }catch (IOException e) {
            e.printStackTrace();
        }

        // 读取文件信息到控制台，反序列化
        try {
            Studet demo = null;
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/tmp/demo.ser"));
            demo = (Studet) ois.readObject();
            ois.close();
            System.out.println("读取到的name: " + demo.name);
            System.out.println("读取到的age: " + demo.age);
            System.out.println("读取到的id: " + demo.id);
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