import java.util.*;

/**
 * Created by alpesh_savani on 09/10/2016.
 */
public class FahrenheirToCelcius {
    public static void main(String[] args) {

        float temperature;
        Scanner in = new Scanner(System.in);


        System.out.println("Enter Temperature in Fahrenheit");
        temperature = in.nextInt();

        temperature = ((temperature -32)*5)/9;

        System.out.println("Temperature in Celsius = " + temperature);

        System.out.println("------------------------------------");




        System.out.println("Enter Temperature in Celcius");
        temperature = in.nextInt();

        temperature = ((9*temperature)/5+32);

        System.out.println("Temperature in Celsius = " + temperature);



    }


}
