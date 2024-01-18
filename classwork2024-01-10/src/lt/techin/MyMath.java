package lt.techin;

public class MyMath {
    double radius;
    static final double PI = 3.1428;

    public MyMath(double radius) {
        this.radius = radius;

    }
    public double getArea(){
        return PI * radius * radius;

    }
}
