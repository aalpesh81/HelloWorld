import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by alpesh_savani on 18/10/2016.
 */
public class FLargestDigit {

    public static void main(String[] args) {
        int samllest = 0;
        int large = 0;
        int num;

        System.out.println("Please enter the Number here :");

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i=0; i<n; i++)
        {
            num = input.nextInt();
            if (num>large)
                   num=large;

            }
            System.out.println("The Largest number is :" + large);

        }

    }

