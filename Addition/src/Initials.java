import java.util.Scanner;

/**
 * Created by alpesh_savani on 13/10/2016.
 */
public class Initials {
    public static void main(String[] args) {
        String name = new String();
        System.out.println("Enter your name: ");
        Scanner input = new Scanner(System.in);
        name = input.nextLine();

        System.out.println("You entered : " + name);
        String temp = new String(name.toUpperCase());

        System.out.println(temp);

        char c = name.charAt(0);
        System.out.println(c);

        for (int i = 1; i < name.length(); i++) {
            c = name.charAt(i);

            if (c == ' ') {
                System.out.println(name.charAt(i - 1));
            }

        }
    }
}