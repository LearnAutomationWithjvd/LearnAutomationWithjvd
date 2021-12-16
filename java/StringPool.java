import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringPool {
    public static void main(String args[]) {
        String s1 = "Mohd";
        String s2 = "Javed";
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        String s3 = String.format("%s%s",s1,s2);
        System.out.println(s3.toString());

        StringBuilder sb = new StringBuilder("Sita");
        StringBuilder sb1 = new StringBuilder("Ram");
        System.out.println(sb.append(sb1).toString());

        String sjoin = String.join("", s1,s2);
        System.out.println(sjoin.toString());


        StringJoiner s = new StringJoiner(",");    //StringeJoiner object
        s.add("Hello");    //String 1
        s.add("World");    //String 2
        System.out.println(s.toString());  //Displays result

        List<String> liststr = Arrays.asList("abc", "pqr", "xyz");  //List of String array
        String str = liststr.stream().collect(Collectors.joining(", ")); //performs joining operation
        System.out.println(str.toString());



        String ss="SachinTendulkar";
        System.out.println("Original String: " + ss);
        System.out.println("Substring starting from index 6: " +ss.substring(6));//Tendulkar
        System.out.println("Substring starting from index 0 to 6: "+ss.substring(0,6)); //Sachin



        String text= "Hello, My name is Sachin";
        /* Splits the sentence by the delimeter passed as an argument */
        String[] sentences = text.split(",");
        System.out.println(Arrays.toString(sentences));
        System.out.println(text.trim());



    }
}
