public class FinalReverseWithoutUsingInbuiltFunction {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        for(int i= a.length-1; i>= 0; i--)
       // for(int i= chars.length-1; i>= 0; i--)
        {
            /*if(chars[i]==' '){
                break;

            }
            else
           System.out.print(chars[i]);*/
            System.out.print(a[i]);
        }

    }
}