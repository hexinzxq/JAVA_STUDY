import java.io.*;

public class SerializableDemo2 {
    public static void main(String[] args) {
        SerializeDemo1 se = new SerializeDemo1();
        se.name = "apk";
        se.address = "najing, jiangsu";
        se.SSN = 124412121;
        se.number = 66;

        try {
            FileOutputStream fileOut = new FileOutputStream("/tmp/SerializeDemo1.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fileOut);
            oos.writeObject(se);
            oos.close();
            fileOut.close();
            System.out.println("Serialized data is saved in /emp/SerializeDemo1.ser");
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}