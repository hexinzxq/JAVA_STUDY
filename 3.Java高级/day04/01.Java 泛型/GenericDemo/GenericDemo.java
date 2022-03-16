public class GenericDemo {
    // 泛型方法printArray
    public static <E> void printArray(E[] arr) {
        for (E eled : arr) {
            System.out.print(eled + "  ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer[] intArr = {1, 2, 3, 4, 5};
        Double[] douArr = {1.1, 2.2, 3.3, 4.4};
        Character[] charArr = {'A', 'b', 'c', 'd'};

        System.out.println("整型数组：");
        printArray(intArr);

        System.out.println("浮点型数组:");
        printArray(douArr);

        System.out.println("字符型数组：");
        printArray(charArr);
    }
}