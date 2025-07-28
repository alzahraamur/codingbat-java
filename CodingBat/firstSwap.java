import java.util.HashMap;
import java.util.Map;

public class firstSwap {
    public String[] firstSwap(String[] strings) {
        Map<Character, Integer> map = new HashMap<>();
        Map <Character, Boolean> swapped = new HashMap<>();

        for (int i=0; i< strings.length; i++) {
            char firstChar = strings[i].charAt(0);

            if (swapped.getOrDefault(firstChar, false)) {
                continue;
            }
            if (map.containsKey(firstChar)) {
                int prevIdex = map. get(firstChar);

                String temp = strings[i];
                strings[i]= strings[prevIdex];
                strings[prevIdex]=temp;

                swapped.put(firstChar, true);
            }
            else {
                map.put(firstChar, i);
            }
        }
        return strings;
    }
}
