class DT {
    public void draw() {}
}

class DrawCircle extends DT {
    public void draw() {
        System.out.println("Draw one Circle");
    }
}

class DrawTriangle extends DT {
    public void draw() {
        System.out.println("Draw one Triangle");
    }
}

class DrawSquare extends DT {
    public void draw() {
        System.out.println("Draw one Square");
    }
}

public class DTDemo {
    public static void main(String[] args) {
        DT dt1 = new DrawCircle();
        DT dt2 = new DrawTriangle();
        DT dt3 = new DrawSquare();
        dt1.draw();
        dt2.draw();
        dt3.draw();
    }
}