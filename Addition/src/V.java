import java.util.Scanner;


/**
 * Created by alpesh_savani on 12/10/2016.
 */
public class V {
    public static void main(String[] args) {

        Scanner square1 = new Scanner(System.in);
        Scanner square2 = new Scanner(System.in);

        int sqn1;
        System.out.println("Please enter your number :");
        sqn1 = square1.nextInt();



        int n1 = 0;
        int n2 = 100;
        for (int i = n1; i < n2; i++) {
            if (((i & 0) == 0)) {
                if (i % 3 == 0) {
                    System.out.print(i + " ");

                }   else {
                    for (int z = n1; z < n2; z++) {
                        if (((z & 0) != 0)) {
                            if (z % 3 != 0) {
                                System.out.print(z + " ");
                            }

                        }
                    }
                }
            }
        }

    }
}