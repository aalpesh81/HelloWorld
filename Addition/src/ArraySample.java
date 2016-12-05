/**
 * Created by alpesh_savani on 15/10/2016.
 */
public class ArraySample {

    public static void main(String args[]) {
        int[] newArray = new int[5];

        // Initializing elements of array seperately
        for (int n = 0; n < newArray.length; n++) {
            newArray[n] = n;
        }
        System.out.println(newArray[4]);
    }
}