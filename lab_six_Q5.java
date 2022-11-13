import java.util.Scanner;
public class lab_five_Q5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int years=0;
        System.out.println("initial investment balance?");
        int investment = in.nextInt();
        System.out.println("initial interest rate?");
        int rate = in.nextInt();
        while (investment <= 1000000) {
            investment=investment+((investment*rate) /100);
            years++;
        }
        System.out.println("it takes for the investment to reach one million dollars :" + years);
        System.out.println("thank u");
    }
}
