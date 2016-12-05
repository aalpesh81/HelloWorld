import java.util.Scanner;

class FLDigitSum {
    int ldig,fdig;
    int Summation(int num){ //logic to find the sum of first and last digit
        int n=num;
        ldig=n%10;
        fdig=n;
        while(n>0)
        {
            fdig=n/10>0?n/10:n;
            n=n/10;
        }
        int sum=ldig+fdig;
        return sum;}
}
class Sumlastfirst{
    public static void main(String[] args)
    {
        int i;
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter your number here : ");
        i = kb.nextInt();
        FLDigitSum lf=new FLDigitSum();
        System.out.println("The sum of last and first digit is "+lf.Summation(i));


    }
}