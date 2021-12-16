
public class SortingOfArray
{
    public static void main(String[] args)
    {
        int temp;
        int[] arrNumbers = {3,2,1,5};
        System.out.println("Before sort: ");
        for(int num : arrNumbers)
        {
            System.out.println(num);
        }
        for(int a = 0; a < arrNumbers.length; a++)
        {
            for(int b = a + 1; b < arrNumbers.length; b++)
            {
                if(arrNumbers[a] > arrNumbers[b])
                {
                    temp = arrNumbers[a];
                    arrNumbers[a] = arrNumbers[b];
                    arrNumbers[b] = temp;
                }
            }
        }
        System.out.println("After sort: ");

        for(int num : arrNumbers)
        {
            System.out.println(num);
        }
        System.out.println("second largest number "+ arrNumbers[4-2]);
    }
}