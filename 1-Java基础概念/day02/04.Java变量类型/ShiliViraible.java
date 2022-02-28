public class ShiliViraible {
    // 这个实例变量对子类可见
    public String name;
    // 私有变量，仅在该类可见
    private double salary;
    // 在构造器中对name赋值
    public ShiliViraible (String shiliName) {
        System.out.println(this.name);
        this.name = shiliName;
    }
    public void setSalary(double shiliSal) {
        this.salary = shiliSal;
    }
    public void print() {
        System.out.println("姓名" + name);
        System.out.println("薪水" + salary);
    }
    public static void main(String[] args) {
        ShiliViraible shili = new ShiliViraible("shili01");
        shili.setSalary(345.54);
        shili.print();
    }
}