package animal;

public class MammalInt implements Animal{
    public void eat() {
        System.out.println("MammalInt eats");
    }
    public void travel() {
        System.out.println("ManmalInt travel");
    }
    public int noOfLegs() {
        return 0;
    }
    public static void main(String[] args) {
        MammalInt m = new MammalInt();
        m.eat();
        m.travel();
    }
}