import java.util.*;

/**
 * @author Kosolapov Ilya (d_dexter@mail.ru)
 * https://www.hackerrank.com/challenges/the-birthday-bar/problem
 */
public class Solution {

    static int birthday(List<Integer> s, int d, int m) {
        if (m > s.size()) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < s.size(); i++) {
            Optional<Integer> sum = s.stream().skip(i).limit(m).reduce(Integer::sum);
            if (sum.get().equals(d)) {
                count++;
            }
        }
        return count;
    }
}
