import java.util.Scanner;

/**
 * Created by Al Savani-HP on 18/10/2016.
 */
public class LargeNumber {
    public static void main(String[] args) {

        int large=0;
        int num;

        System.out.println("Please enter your 5 digit number here :");

        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        for (int i=0; i<n; i++) {
            num = kb.nextInt();
            if (num>large)
            {
                large = num;
            }
            System.out.println("The Large Digit is : " + large);
        }
    }
}

