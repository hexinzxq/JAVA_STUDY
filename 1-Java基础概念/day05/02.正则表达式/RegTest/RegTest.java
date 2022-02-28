import java.util.regex.*;
class RegT1 {
    public static void main(String[] args) {
        String contetcontent = "I am nood" + "I come from NewYork";
        String pattern = ".*NewYork";
        boolean isMatch = Pattern.matches(pattern, contetcontent);
        System.out.println("是否包含NewYrok字符串:" + isMatch);
    }
}