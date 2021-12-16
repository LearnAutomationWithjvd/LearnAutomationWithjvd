import java.util.*;

class Permutation{

    static void permute(String s , String answer)
    {
        if (s.length() == 0)
        {
            System.out.print(answer + " ");
            return;
        }

        for(int i = 0 ;i < s.length(); i++)
        {
            char ch = s.charAt(i);
            String left_substr = s.substring(0, i);
            String right_substr = s.substring(i + 1);
            String rest = left_substr + right_substr;
            permute(rest, answer + ch);
        }
    }

    // Driver code
    public static void main(String args[])
    {

        String answer="";

        String s = "Dev";
        permute(s, answer);


    }
}
