import java.util.*;

public class PropDemo {
    public static void main(String[] args) {
        Properties capitals = new Properties();
        Set states;
        String str;

        capitals.put("nanjing", "pukou");
        capitals.put("chengdu", "shuangliu");
        capitals.put("yaan", "lushan");
        capitals.put("shanghai", "pudong");

        // show all states and capitals in hashtable
        states = capitals.keySet(); // get set-view of keys
        Iterator itr = states.iterator();
        while (itr.hasNext()) {
            str = (String) itr.next();
            System.out.println("the capital of " + str + " is " + capitals.getProperty(str) + ".");
        }

        // look for state not in list -- specify default
        str = capitals.getProperty("Tokoy", "Not Found");
        System.out.println("the capital of Tokoy is " + str + ".");
    }
}