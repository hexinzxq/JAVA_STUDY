import java.util.*;

public class EnumerationDemo {
    public static void main(String[] args) {
        Enumeration<String> days;
        Vector<String> dayNames = new Vector<String>();
        dayNames.addElement("Sunday");
        dayNames.addElement("Monday");
        dayNames.addElement("Tuesday");
        dayNames.addElement("Wednesday");
        dayNames.addElement("Thursday");
        dayNames.addElement("Friday");
        dayNames.addElement("Saturday");
        days = dayNames.elements();
        while (days.hasMoreElements()) {
            System.out.println(days.nextElement());
        }
    }
}