public class XHWhile {
    public static void main(String[] args) {
        int x = 10;
        // while循环，满足条件就会一直循环执行下去,如果条件中传一个true，则循环会一直执行下去
        while (x < 20) {
            System.out.println("当前的x为：" + x);
            x++;
            System.out.println("\n");
        }
        // do...while循环，可以保证至少执行一次
        do {
            System.out.println("当前do-while语句的x为：" + x);
        }while (x < 10);
    }
}