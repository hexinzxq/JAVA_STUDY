import java.util.*;

@SuppressWarnings("unchecked")
public class HashTableDemo {
    public static void main(String[] args) {
        // create a hashmap
        Hashtable balance = new Hashtable();
        Enumeration names;
        String str;
        double bal;

        balance.put("Iphone", (Double) 7499.00);
        balance.put("Xiaomi", (Double) 69999.99);
        balance.put("HuaWei", (Double) 10999.99);
        balance.put("SAMSANG", (Double) 5999.00);
        balance.put("Redmi", (Double) 3999.99);

        // show all balaces in hash table
        names = balance.keys();
        while (names.hasMoreElements()) {
            str = (String) names.nextElement();
            System.out.println(str + ":" + balance.get(str));
        }

        // Deposit 1000 into Iphone`s account
        bal = ((Double) balance.get("Iphone")).doubleValue();
        balance.put("Iphone", ((Double) bal + 1000));
        System.out.println("Iphone new balance:" + balance.get("Iphone"));
    }
}