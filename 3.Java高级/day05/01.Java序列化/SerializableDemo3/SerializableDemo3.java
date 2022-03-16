import java.io.*;

public class SerializableDemo3 {
    public static void main(String[] args) {
        SerializeDemo1 se = null;
        try {
            FileInputStream fis = new FileInputStream("/tmp/SerializeDemo1.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            se = (SerializeDemo1) ois.readObject();
            ois.close();
            fis.close();
        }catch (IOException e) {
            e.printStackTrace();
            return;
        }catch (ClassNotFoundException e) {
            System.out.println("SerializeDemo1 class not found.");
            e.printStackTrace();
            return;
        }
        System.out.println("反序列化输出的内容...");
        System.out.println("Name: " + se.name);
        System.out.println("Address: " + se.address);
        System.out.println("SSN: " + se.SSN);
        System.out.println("Number: " + se.number);
    }
}