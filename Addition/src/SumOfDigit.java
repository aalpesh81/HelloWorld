import java.util.Scanner;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by alpesh_savani on 17/10/2016.
 */
public class SumOfDigit {
    public static void main(String args[]) {


        Scanner sc = new Scanner(System.in);


        System.out.println("Please enter a number to calculate sum of digits");
        int number = sc.nextInt();
        // Remember number/10 reduces one digit from number
        // and number%10 gives you last digit

        int sum = 0;
        int input = number;

        while (input != 0) {
            int lastdigit = input % 10;
            sum += lastdigit;
            input /= 10;
        }
            System.out.printf("Sum of digits of number %d is %d", number, sum);
        }
    }
