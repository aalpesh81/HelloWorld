import java.util.Scanner;

/**
 * Created by alpesh_savani on 18/10/2016.
 */
public class StringLength {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter your sentence here :");
        String strg1 =kb.nextLine();

        System.out.print("The length of your Sentence is :");
        System.out.println(strg1.length());
    }
}
