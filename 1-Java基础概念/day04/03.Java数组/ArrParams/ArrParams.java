public class ArrParams {
    public void prinArr(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }
    public static void main(String[] args) {
        int[] newArr = new int[]{1, 7, 89, 54, 3};
        System.out.println(newArr.length);
        // System.out.println(newArr.length());
        ArrParams a1 = new ArrParams();
        a1.prinArr(newArr);
        // a1.prinArr(newArr.length);
        // a1.prinArr(newArr.length());
    }
}