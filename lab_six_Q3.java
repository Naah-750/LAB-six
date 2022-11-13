import java.util.Scanner;
public class lab_five_Q3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("insert string :");
        String word=in.next();
        for (int i = 0; i <word.length(); i++) {
            System.out.println(word.charAt(i));
        }
        System.out.println("thank u");
    }
}
