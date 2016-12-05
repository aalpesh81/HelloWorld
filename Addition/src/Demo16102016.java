import java.util.Scanner;

/**
 * Created by alpesh_savani on 15/10/2016.
 */
public class Demo16102016 {
    public static void main(String[] args) {

//        Scanner kb = new Scanner(System.in);


            int n, c;

            System.out.println("Enter an integer to print it's multiplication table");
            Scanner in = new Scanner(System.in);
            n = in.nextInt();

            System.out.println("Multiplication table of "+n+" is :-");

            for ( c = 1 ; c <= 10 ; c++ )
                System.out.println(n+"*"+c+" = "+(n*c));
        }
    }



