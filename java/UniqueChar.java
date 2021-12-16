// Java program to print distinct characters of a
// string.
public class UniqueChar {

    public static void main(String args[])
    {
        String str = "Hello World";

        uniqueCharacters(str);

    }
    public static void uniqueCharacters(String str){
        String temp = "";
        for (int i = 0; i < str.length(); i++){
            if (temp.indexOf(str.charAt(i)) == - 1){
                temp = temp + str.charAt(i);
            }
        }

        System.out.println(temp + " ");

    }
}

