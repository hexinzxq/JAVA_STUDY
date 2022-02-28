public class CanChangeParams {
    public static void main(String[] args) {
        printMax(23.43, 12.32, 43.23123, 532.232);
        printMax(new double[] {4, 6, 7, 7, 8, 5});
    }
    public static void printMax(double ...numbers) {
        if (numbers.length == 0) {
            System.out.println("No Arguments!");
            return;
        }
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > result) {
                result = numbers[i];
            }
        }
        System.out.println("The max numer is: " + result);
    }
}