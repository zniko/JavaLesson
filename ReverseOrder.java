import java.util.Scanner;

public class ReverseOrder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Wprowadz ciag znakow :");
        String line = sc.nextLine();
        char[] lineCharArray = line.toCharArray();
        int j= line.length();
        for(int i=j-1; i>=0; i--){
            System.out.print(lineCharArray[i]);

        }
    }
}
