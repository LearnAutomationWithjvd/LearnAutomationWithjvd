import java.util.Scanner;

public class CompareTwoArrayAndFindOutCommon {

    public static void main (String args[]) {
       /* 1.   Print both given arrays
        2.  Loop through first array till the first  array length
        Inside first array loop,  loop the second array  till the length   of the second array
        2.1       Compare elements of first array to the elements of the second array
        2.2       If  first array element matches with second array element
        create new third  resulting array  and store the matching element in it
                                         else
        continue
        3. Print the third resulting  array   showing intersection of the two given arrays*/

       int[] a={1,2,3,4,5,6};
       int[] b={0,9,8,7,1,3};
       /* Scanner scn = new Scanner(System.in);
        String str1 = scn.nextLine();
        char[] a = str1.toCharArray();

        String str2 = scn.nextLine();
        char[] b = str2.toCharArray();*/

        int Newarr[] = new int[a.length+b.length];
         int c =0;


        for(int i = 0; i<a.length; i++) {

            for(int j=0;j<b.length;j++) {

                if(a[i]==b[j]){
                    Newarr[c]=a[i];
                    c++;


                }
                else
                    continue;
            }

        }
        System.out.println("Intersection of two  array is " +"  " );
        for(int k=0;k < c;k++)
        {
            System.out.print("  "+ Newarr[k] +" ");
        }
        System.out.println("            ");

    }
}
