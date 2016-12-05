import java.util.Scanner;

/**
 * Created by alpesh_savani on 15/10/2016.
 */
    public class DoWhileDemo {
             public static void main(String[] args) {

                 Scanner sc = new Scanner(System.in);

                 int num;
                 System.out.println("Please enter the Value : ");
                 num = sc.nextInt();



                 int sum = 0;

                 while (num > 0) {
                     sum = sum + num % 10;
                     num = num / 10;
                 }
                 System.out.println(sum);
    }
}


