import java.util.Arrays;

public class AnagramWords {
    public static void main(String args[]) {
        String str1 = "LISTEN";
        String str2 ="SILENT";
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        if(Anagram(ch1, ch2)) System.out.println("The two strings are"
                + " anagram of each other");
        else
            System.out.println("The two strings are not"
                    + " anagram of each other");

    }

    static boolean Anagram(char a[], char b[]){
        int len1 = a.length;
        int len2 = b.length;

        if(len1 !=len2)
            return false;


        Arrays.sort(a);
        Arrays.sort(b);


        for(int i=0; i< len1; i++) {
            if(a[i] !=b[i])
                return false;
        }
        return true;

    }
}
