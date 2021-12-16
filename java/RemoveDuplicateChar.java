import java.util.*;

public class RemoveDuplicateChar {
    public static void main(String args[]) {
        String str = "hello world";
        char[] ch =str.toCharArray();
        int len = ch.length;
        System.out.println(removeDuplicate(ch, len));

    }

    static String removeDuplicate(char a[], int l) {
        int index = 0;

        for(int i =0 ; i< l ; i++) {
            int j;
            for(j =0 ;j <i ; j++) {
                if(a[i] == a[j]){
                    break;
                }
            }
            if (j == i){

                    a[index++] = a[i];


            }

        }
        return String.valueOf(Arrays.copyOf(a, index));
    }
}
