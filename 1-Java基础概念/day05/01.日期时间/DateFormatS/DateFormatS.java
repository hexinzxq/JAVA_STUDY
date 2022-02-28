import java.util.*;
import java.text.*;

public class DateFormatS {
    public static void main(String[] args) {
        Date dNow = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd hh:mm:ss yyyy");
        System.out.println(sdf.format(dNow));
    }
}