public class XHContinue {
    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 4, 5};
        for (int x : nums) {
            if (x == 2) {
                continue;
            }
            if (x == 4) {
                break;
            }
            System.out.println(x);
        }
    }
}