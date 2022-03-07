public class Test {
    public static void main(String[] args) {
        String s1 = "aaa";
        String s2 = "aaa";
        int x = 1;
        System.out.println("s1 == s2 is:" + ( s1 == s2)); //s1 == s2 is:true
        System.out.println("s1 == s2 is:" +  s1 == s2); //只输出一个false，坑！！！！！！！！！！！，那个 + 运算符优先级影响，把右边的字符串与左边的结果相加了！！！！
        System.out.println(x++);
        System.out.println(++x);
    }
}