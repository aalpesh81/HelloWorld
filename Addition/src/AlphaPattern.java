/**
 * Created by alpesh_savani on 18/10/2016.
 */
public class AlphaPattern {
    public static void main(String args[])
    {
        int alphabet=65;
        for (int i = 1; i <=5 ; i++)
            {
            for(int j=1; j<=i; j++)
            {
                System.out.print((char)alphabet);
            }
            System.out.println();
                alphabet++;
        }
    }
}
