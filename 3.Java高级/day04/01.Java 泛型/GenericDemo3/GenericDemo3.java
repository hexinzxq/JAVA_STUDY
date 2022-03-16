public class GenericDemo3<T> {
    private T t;
    public void add(T t) {
        this.t = t;
    }
    public T get() {
        return t;
    }
    public static void main(String[] args) {
        GenericDemo3<Integer> integerBox = new GenericDemo3<Integer>();
        GenericDemo3<String> stringBox = new GenericDemo3<String>();

        integerBox.add((Integer) 10);
        stringBox.add(new String("上海"));

        System.out.printf("整型值为： %d\n", integerBox.get());
        System.out.printf("字符串为： %s\n", stringBox.get());
    }
}