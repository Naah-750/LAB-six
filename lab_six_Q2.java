import java.util.Scanner;
public class lab_five_Q2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("insert string :");
        String word=in.next();
        for (int i = word.length()-1 ; i >=0; i--) {
            System.out.println(word.charAt(i));
        }
        System.out.println("thank u");
    }
}
