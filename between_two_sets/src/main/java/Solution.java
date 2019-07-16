import java.util.*;

/**
 * @author Kosolapov Ilya (d_dexter@mail.ru)
 * https://www.hackerrank.com/challenges/between-two-sets/problem
 */
public class Solution {
    public static int getTotalX(List<Integer> a, List<Integer> b) {

        int line1 = lcm(a);
        int line2 = gcd(b);
        int count = 0;
        for (int i = line1; i <= line2; i += line1) {
            if (line2 % i == 0) {
                count++;
            }
        }
        return count;
    }

    private static int lcm(List<Integer> a) {
        int max = a.stream().max(Integer::compareTo).get();
        int n = max;
        for (int i = 0; i < a.size() && n <= 100; i++) {
            if (n % a.get(i) != 0) {
                i = 0;
                n += max;
            }
        }
        return n;
    }

    private static int gcd(List<Integer> b) {
        int min = b.stream().min(Integer::compareTo).get();
        int n = min;
        //System.out.println(b);
        for (int i = 0; i < b.size() && n <= 100;) {
            int el = b.get(i);
            //System.out.println(el + "%" + n);
            if (el % n != 0) {
                i = 0;
                n--;
                continue;
            }
            i++;
        }
        return n;
    }
}
