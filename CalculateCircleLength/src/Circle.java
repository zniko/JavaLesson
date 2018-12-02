public class Circle {
    final double PI = 3.14d;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    double radius;

    double length;
    public double getLength() {
        return length;
    }
public void circleLength(Circle circle){

        length = 2*PI*getRadius();
}

}

