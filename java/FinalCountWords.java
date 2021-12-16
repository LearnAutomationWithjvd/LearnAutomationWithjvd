import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FinalCountWords {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        /*int[] arr = {1,2,2,2,2,3,4,4};
        int len = arr.length;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i<len; i++){
            if(map.containsKey(arr[i])) {
                int count = map.get(arr[i]);
                map.put(arr[i], count+1);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        System.out.println(map);*/

       /* String str = "A This A is is done by Saket Saket";
        String[] split = str.split(" ");

        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for (int i=0; i<split.length; i++) {
            if (map.containsKey(split[i])) {
                int count = map.get(split[i]);
                map.put(split[i], count+1);
            }
            else {
                map.put(split[i], 1);
            }
        }
        System.out.println(map);

        */

      /*  String str = "ThisthisisisdonebySaketSaket";
        char[] ch = str.toCharArray();

        HashMap<Character,Integer> map = new HashMap<Character, Integer>();
        for (int i=0; i<ch.length; i++) {
            if (map.containsKey(ch[i])) {
                int count = map.get(ch[i]);
                map.put(ch[i], count+1);
            }
            else {
                map.put(ch[i], 1);
            }
        }
        System.out.println(map);*/


        String str = "aaaabbbccd";
        char[] ch = str.toCharArray();

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i< ch.length ; i++){
            if(map.containsKey(ch[i])){
                int count = map.get(ch[i]);
                map.put(ch[i], count+1);
            }
            else {
                map.put(ch[i], 1);
            }
        }
        System.out.println(map);
    }

}