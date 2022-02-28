public class TestArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        // 打印所有元素
        for (int i = 0; i < arr.length; i++) {
            System.out.println("每个数组元素:" + arr[i]);
        }
        // 计算元素总和
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        System.out.println("数组元素总和为：" + total);
        // 查找最大元素
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("此数组最大的元素是：" + max);
        // System.out.println("这个数组是" + arr);
    }
}