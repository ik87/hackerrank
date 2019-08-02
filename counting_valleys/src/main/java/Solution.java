/**
 * @author Kosolapov Ilya (d_dexter@mail.ru)
 * https://www.hackerrank.com/challenges/counting-valleys/problem
 */
public class Solution {

    static int countingValleys(int n, String s) {
        int alt = 0;
        int val = 0;
        for (int i = 0; i < n; i++) {

            if (s.charAt(i) == 'U') {
                alt++;
            } else {
                alt--;
            }

            if (alt == 0  &&  s.charAt(i) == 'U') {
                val++;
            }
        }
        return val;
    }
}
