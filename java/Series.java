public class Series
{
    public static void main(String args[])
    {

        int n = 6;
        int s = 0;                                          // s for terms of series, c for n terms
        for (int i = 1; i <= n; i++)                          // To generate n terms
        {
            s = s * 10 + 1;
            System.out.print(s + " ");
        }

        //for  ends

        System.out.println("--------Fibonnaic series--------");

        int a=0, b=1, c=0;
        System.out.print(a);
        System.out.print(b);
        for(int i = 0; i<=5; i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(c);
        }


    }
}