enum Color {
    RED, BLUE, PINK;
}

public class EnumDemo {
    public static void main(String[] args) {
        // 调用values()
        //System.out.println(Color.values());
        Color[] arr = Color.values(); // 这东西返回是是个数组啊。。。
        // 迭代枚举
        for (Color col : arr) {
            // 查看索引
            System.out.println("颜色" + col + "的索引是：" + col.ordinal());
        }
        // 使用valurOf()返回枚举常量，不存在的会报错IllegalArgumentException
        System.out.println(Color.valueOf("RED"));
    }
}