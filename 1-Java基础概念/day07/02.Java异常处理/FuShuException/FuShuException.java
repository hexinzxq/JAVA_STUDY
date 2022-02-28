class FushuExcept extends Exception {
    private int value;
    FushuExcept() {
        super();
    }
    FushuExcept(String msg, int value) {
        super(msg); // 调用父类的有参构造，获得异常信息
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}

class Demo {
    int div(int a, int b) throws FushuExcept {
        if (b < 0) {
            throw new FushuExcept("出现了除数是负数的情况" , b);
        }
        return a / b;
    }
}

public class FuShuException {
    public static void main(String[] args) {
        Demo d = new Demo();
        try {
            int x = d.div(5, -2);
            System.out.println("当前a与b相除的值为：" + x);
        }
        catch (FushuExcept e) {
            System.out.println(e.toString());
            System.out.println("错误的负数是：" + e.getValue());
        }
        // 大的异常放在下方，小的异常放在上方
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}