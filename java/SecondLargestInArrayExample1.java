import java.util.Arrays;
public class SecondLargestInArrayExample1{
   /* public static int getSecondLargest(int[] a, int total){
        Arrays.sort(a);
        return a[total-3];
    }*/
    public static void main(String args[]){
        int a[]={7,0,-5,9,2,8};
        Arrays.sort(a);
        System.out.println("Second Largest: "+ a[6-3]);


    }
}