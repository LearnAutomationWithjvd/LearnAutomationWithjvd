/*
import java.util.*;
import java.util.stream.Collectors;

*/
/**
 * Time - O(n^2)
 *//*

public class OrderByFrequency {
    public static void main(String[] args) {
       String in = "AabBBbCAAAdbb";
      //  String in = "The Javed Javed is is a great man";

        //1.Character Frequency Map
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < in.length(); i++) {
            String key = String.valueOf(in.charAt(i)).toLowerCase();
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        System.out.println("Freq Map - "+map);

        //2. Sort map by value in decreasing order
        List<Map.Entry<String, Integer>> list = map.entrySet()
                .stream()
                .sorted((e, f) -> f.getValue().compareTo(e.getValue()))
                .collect(Collectors.toList());

        System.out.println("Sorted Map - " + list);
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, Integer> entry : list) {
            for (int i = 0; i < in.length(); i++) {
                if (entry.getKey().equalsIgnoreCase(String.valueOf(in.charAt(i)))) {
                    result.append(in.charAt(i));
                }
            }
        }
        System.out.println(result);
    }
}*/
