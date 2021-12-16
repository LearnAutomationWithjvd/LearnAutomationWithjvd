import java.util.Scanner;

public class RemoveWhiteSpace {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println(" Enter the String:");
        String str = scn.nextLine();
        for(int i =0; i<str.length(); i++) {
            char ch=str.charAt(i);
            if(ch !=' '){
                System.out.print(ch);
            }
        }
        System.out.println();
    }
}
