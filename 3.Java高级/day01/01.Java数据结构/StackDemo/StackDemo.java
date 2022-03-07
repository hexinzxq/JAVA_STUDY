import java.util.*;

public class StackDemo {
    static void showpush(Stack<Integer> st, int a) {
        st.push((Integer) a);
        System.out.println("push("+ a +")");
        System.out.println("stack：" + st);
    }
    static void showpop(Stack<Integer> st) {
        System.out.println("pop ->");
        Integer a = (Integer) st.pop();
        System.out.println(a);
        System.out.println("stack:" + st);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        System.out.println("stack: " + st);
        try {
            showpush(st, 42);
            showpush(st, 142);
            showpush(st, 242); // 这是在向栈中不断压入新的东西
            showpop(st); // 根据栈的后进先出，这里的242会被取出来，所以栈里只有42和142，以此类推
            showpop(st);
            showpop(st);
            showpop(st); // 上一行为止，st这个栈已经是一个空栈了，再次pop会抛异常，需要做出对应处理
        } catch (EmptyStackException e) {
            System.out.println(e);
        }
    }
}