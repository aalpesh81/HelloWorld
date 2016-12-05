import java.util.Scanner;

/**
 * Created by alpesh_savani on 15/10/2016.
 */
public class LengthFinder {
    public static void main(String[] args) {

        String str1;

        Scanner length = new Scanner(System.in);
        System.out.println("Please enter the value here :");
        str1 = length.nextLine();

        System.out.println(str1.length());

    }
}
