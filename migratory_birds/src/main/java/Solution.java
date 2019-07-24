import java.util.*;

public class Solution {
    static int migratoryBirds(List<Integer> arr) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < arr.size(); i++) {
            map.computeIfPresent(arr.get(i), (x, y) -> y + 1);
            map.putIfAbsent(arr.get(i), 1);
        }
        int count = 0;
        int key = Integer.MAX_VALUE;
        System.out.println(map);
        for (Map.Entry<Integer, Integer> el : map.entrySet()) {
            if (el.getValue() > count) {
                count = el.getValue();
                key = el.getKey();
            } else if (el.getValue() == count && key > el.getKey()) {
                key = el.getKey();
            }
        }
        return key;

    }
}
