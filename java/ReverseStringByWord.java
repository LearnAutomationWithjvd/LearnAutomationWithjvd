public class ReverseStringByWord {

    public static void main(String args[]){
        String inputString = "Mohammad Javed malayalam";
        String[] words = inputString.split(" ");

        String reverseString = "";

        for (int i = 0; i < words.length; i++)
        {
            String word = words[i];

            String reverseWord = "";

            for (int j = word.length()-1; j >= 0; j--)
            {
                reverseWord = reverseWord + word.charAt(j);
            }
            if(word.equals(reverseWord))
                System.out.println(reverseWord +" is palindrome ");
            else
                System.out.println(reverseWord +" is not a palindrome");

            reverseString = reverseString + reverseWord + " ";
        }

        System.out.println(inputString);

        System.out.println(reverseString);

        System.out.println("-------------------------");

    }
}
