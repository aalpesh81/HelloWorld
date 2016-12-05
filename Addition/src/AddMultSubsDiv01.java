import java.util.Scanner;

/**
 * Created by alpesh_savani on 12/10/2016.
 */
public class AddMultSubsDiv01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int firstnumber=0, secondnumber=0;
        int addition, division, multiplication, substraction;

        System.out.println("Enter the First Number");
        firstnumber = input.nextInt();
        System.out.println("Enter the Second Number");
        secondnumber = input.nextInt();

        addition = firstnumber + secondnumber;
        System.out.println("Addition of the two number is :" + addition);

        division = firstnumber / secondnumber;
        System.out.println("Division of the two number is :" + division);

        multiplication = firstnumber * secondnumber;
        System.out.println("Multiplication of the two number is :" + multiplication);

        substraction = firstnumber + secondnumber;
        System.out.println("Substraction of the two number is :" + substraction);

    }

}