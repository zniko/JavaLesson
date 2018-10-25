import java.util.Scanner;

public class SwapVariables {


    public static void main(String[] args) {


        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a : ");
        a = sc.nextInt();
        System.out.println("Enter b : ");
        b = sc.nextInt();
        sc.close();

        System.out.println("Before swapping  a is : " + a + " and b is : " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping  a is : " + a + " and b is : " + b);

    }
}
