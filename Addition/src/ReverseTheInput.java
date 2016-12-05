import java.util.Scanner;

/**
 * Created by alpesh_savani on 16/10/2016.
 */
public class ReverseTheInput {
    public static void main(String[] args) {

        System.out.println("Please enter any name :");

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        int len=name.length();
        String reverse="";

        System.out.println(name.length());

        for (int i = len-1; i >=0 ; i--)
        {
            reverse = reverse+name.charAt(i);
            System.out.println(name.charAt(i));
        }
        System.out.println("reverse name is :" + reverse);

    }
}
