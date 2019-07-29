import java.util.HashMap;
import java.util.Map;
/**
 * @author Kosolapov Ilya (d_dexter@mail.ru)
 * https://www.hackerrank.com/challenges/sock-merchant/problem
 */
public class Solution {
    static int sockMerchant(int n, int[] ar) {
        int countPairs = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.computeIfPresent(ar[i], (x, y) -> y + 1);
            map.putIfAbsent(ar[i], 1);
        }

        for (Integer val : map.values()) {
            if (val != 1) {
                countPairs += val / 2;
            }
        }
        return  countPairs;
    }
}
