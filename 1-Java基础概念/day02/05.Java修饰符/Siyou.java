public class Siyou {
    // 默认的无修饰符
    String name = "jack";
    // 公共访问权限的修饰符
    public int a = 10;
    // 私有的format，外部无法直接获取以及修改
    private String format;
    // 外部的获取方式
    public String getFormat() {
        return this.format;
    }
    // 外部的修改方式
    public void setFormat(String format) {
        this.format = format;
    }
}