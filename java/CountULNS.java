public class CountULNS {
    public static void main(String args[]) {
        String str = "Ja1$#@$@V2e3D4kH@aN";
        int upperCase = 0, lowerCase = 0, specialChar = 0, num = 0;
        char[] ch = str.toCharArray();

        for(int i = 0 ; i<ch.length; i++) {
            if(ch[i] >= 'A' && ch[i] <= 'Z') {
                upperCase ++;
            }
            else if(ch[i] >= 'a' && ch[i] <= 'z') {
                lowerCase ++;

            }
            else if(ch[i] >= '0' && ch[i] <= '9') {
                num ++;

            }
            else specialChar++;
        }
        System.out.println("Lower case letters : " + upperCase);
        System.out.println("Upper case letters : " + lowerCase);
        System.out.println("Number : " + num);
        System.out.println("Special characters : " + specialChar);

    }
}
