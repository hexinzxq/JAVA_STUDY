public class BufferTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("10");
        sb.append("Test...");
        System.out.println(sb);
        sb.append("!");
        System.out.println(sb);
        sb.insert(8, "Java");
        System.out.println(sb);
    }
}