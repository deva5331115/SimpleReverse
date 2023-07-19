import java.util.Scanner;

public class SimpleReverse {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String word=scan.next();
        findReverse(word);
    }
    public static void findReverse(String word)
    {

        for (int i=word.length()-1;i>=0;i--)
        {
            System.out.print(word.charAt(i));
        }

    }


}
