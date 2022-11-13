import java.util.Scanner;
public class lab_five_Q1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a word :");
        String word=in.next();
        int x=0;
        for (int i = 0; i <word.length(); i++) {
            if (word.charAt(i) == 'o'  ) x++;
            if (word.charAt(i) == 'e'  ) x++;
            if (word.charAt(i) == 'i'  ) x++;
            if (word.charAt(i) == 'a'  ) x++;
            if (word.charAt(i) == 'y'  ) x++;
            if (word.charAt(i) == 'u'  ) x++;
        }
        System.out.println("the number of vowels in the word :" + x);
        System.out.println("thank u");
    }
}
