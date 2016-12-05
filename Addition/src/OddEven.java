import java.awt.*;
import java.util.Scanner;

/**
 * Created by alpesh_savani on 09/10/2016.
 */
public class OddEven {
    public static void main(String[] args) {

        int i;
        for ( i=1; i<=10; i++){
            if (i%2==0) {
                System.out.println("even");
                System.out.println(i);
            }
            else {
                System.out.println("odd");
                System.out.println(i);
            }
        }
    }
}