public class GenericDemoMyself<M> {
    private M m;
    public void add(M m) {
        this.m = m;
    }
    public M get() {
        return m;
    }

    public static void main(String[] args) {
        GenericDemoMyself<Double> gdm = new GenericDemoMyself<Double>();
        GenericDemoMyself<Integer> gdm1 = new GenericDemoMyself<Integer>();

        gdm.add(2.22);
        gdm1.add(4);

        System.out.printf("浮点数为： %f\n", gdm.get());
        System.out.printf("整数为： %d\n", gdm1.get());
    }
}