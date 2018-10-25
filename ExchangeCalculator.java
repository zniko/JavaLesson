import java.text.DecimalFormat;
import java.util.Scanner;

public class ExchangeCalculator {

    public static final double EUR = 4.3, USD = 3.7;

    public static void main(String[] args) {
        double amount;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount of Polish Zloty : ");
        amount = sc.nextInt();
        System.out.println("What money You want to pay EUR or USD ?     1-EUR , 2-USD");
        int currency = sc.nextInt();
        sc.close();
        DecimalFormat df = new DecimalFormat("#.##");
        if (currency == 1)
            System.out.println("You need to pay " + (df.format(exchangeCalc(amount, currency))) + "  EUR");
        if (currency == 2)
            System.out.println("You need to pay " + (df.format(exchangeCalc(amount, currency))) + "  USD");


    }

    public static double exchangeCalc(double amount, int currency) {
        if (currency == 1)
            amount = amount / EUR;
        if (currency == 2)
            amount = amount / USD;

        return amount;

    }


}


//          Program 3: ExchangeCurrency
//        You should define an rates of currencies to Polish Zloty (example: EUR/PLN, USD/PLN, etc).
//
//        Your program should print how many EUR and USD we shall obtain if we change certain
//        amount of Polish Zloty.