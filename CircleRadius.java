import java.util.Scanner;

public class CircleRadius {

    public static final double PI = 3.14;

    public static void main(String[] args) {


        double r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius : ");
        r = sc.nextDouble();
        sc.close();
        System.out.println("Circle length is : " + circleLength(r));


    }

    public static double circleLength(double r) {
        r = 2 * PI * r;
        return r;
    }


}
