/**
 * Created by alpesh_savani on 17/10/2016.
 */
public class SumOfFirstLastDigit {
    public static void main(String args[])
    {
        int digit=0;
        int no=Integer.parseInt(args[0]);
        digit=digit+no%10;
        while(no>9)
        {
            no/=10;
        }
        digit=digit+no;
        System.out.println("Reverse Digit:-"+digit);
    }
}

