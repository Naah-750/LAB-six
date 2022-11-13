import java.util.Scanner;
public class lab_five_Q4 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            if(i%2 == 0)
                System.out.println(i);
        }
        Scanner in=new Scanner(System.in);
        System.out.println("insert two num :");
        int x = in.nextInt();
        int y = in.nextInt();
        for (int i = x; i <= y; i++) {
            if(i%2 != 0)
                System.out.println(i);
        }
        System.out.println("insert num :");
        int num  = in.nextInt();
        int sum=0 , z;
        while (num!=0)
        {
            z=num%10;
            if (z%2 != 0) {
                sum+=z;
            }
            num=num/10;
        }
        System.out.println(sum);
        System.out.println("thank u");
    }}