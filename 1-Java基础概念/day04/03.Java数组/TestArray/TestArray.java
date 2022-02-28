public class TestArray {
    public static void main(String[] args) {
        int size = 5;
        double[] testArr = new double[size];
        testArr[0] = 1.06;
        testArr[1] = 2.06;
        testArr[2] = 3.06;
        testArr[3] = 4.06;
        testArr[4] = 5.06;
        double total = 0;
        for (int i = 0; i < size; i++) {
            total += testArr[i];
        }
        System.out.println("这个数组总数是:" + total);
    }
}