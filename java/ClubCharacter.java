import java.util.HashMap;

public class ClubCharacter {

    public static void main(String args[]) {

        String str = "aaabbbaaccdd";
        char[] ch = str.toCharArray();
        int len = ch.length;
        char arr[] = new char[len];

        for(int i = 0; i<len ; i++){
            if(ch[i] != arr[i]) {
                System.out.println("---------");
                System.out.println(ch[i]);
            }
        }

       /* HashMap<Character,String> map = new HashMap<Character, String>();
        for (int i=0; i<ch.length; i++) {
            String s="";
           if(map.containsKey(ch[i])){
              //  int count = map.get(ch[i]);
                 s = map.get(ch[i]);
                map.put(ch[i], s+ch[i]);
            }
            else {
                map.put(ch[i], s);
            }
        }
        System.out.println(map);*/
    }
}
