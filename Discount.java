import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        int client;
        boolean regular = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj wiek klienta : ");
        client = sc.nextInt();
        System.out.println("Czy to staly klient ?  y/n ");
        int stan = sc.nextInt();
        sc.close();
        //System.out.println(stan + " wynik wprowadzniea ");

        int discount = 0, discount2 = 0;

        if (client > 65) {
            discount = 10;
        }
        if (client < 18) {
            discount = 25;
        }

        if (stan == 1)
            regular = true;
        if (stan == 0)
            regular = false;

        if (regular)
            discount = discount + 5;

        System.out.println("Discount is : " + discount + "%");

        discount2 = regular ? ((client < 18) ? 30 : (client > 65) ? 15 : 5) : ((client < 18) ? 25 : (client > 65) ? 10 : 0);

        System.out.println("Discount 2 is : " + discount2 + "%");

    }

}



