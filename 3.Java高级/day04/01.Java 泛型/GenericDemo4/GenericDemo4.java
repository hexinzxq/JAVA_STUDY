import java.util.*;

public class GenericDemo4 {
    public static void getData(List<?> data) {
        System.out.println("data： " + data.get(0));
    }

    // 类型通配符上限通过形如List来定义，像下面这样定义就是通配符泛型接受Number及其下层的子类关系
    public  static void getUperData(List< ? extends Number > data) {
        System.out.println("Updata： " + data.get(0));
    }

    // 类型通配符下限通过形如List<? super Number>来定义，表示类型只能接受Number及其上层父类关系，如Object类型的实例

    public static void main(String[] args) {
        List<String> name = new ArrayList<String>();
        List<Integer> age = new ArrayList<Integer>();
        List<Double> salary = new ArrayList<Double>();

        name.add("lily");
        age.add(18);
        salary.add(12.3);

        // 因为getData()方法的参数是List<?>类型的，所以name,age,salary都可以作为这个方法的实参，这就是通配符的作用
        getData(name);
        getData(age);
        getData(salary);

//        getUperData(name); // 此处报错，因为指定了要传的List为Number及其所属的类型（以NUmber为父类的类型）
        getUperData(age);
        getUperData(salary);

    }
}