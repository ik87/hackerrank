/**
 * @author Kosolapov Ilya (d_dexter@mail.ru)
 * https://www.hackerrank.com/challenges/electronics-shop/problem
 */
public class Solution {
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {

        int max = -1;
        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {
                if ((keyboards[i] + drives[j]) > max && (b - (keyboards[i] + drives[j])) >= 0) {
                    max = keyboards[i] + drives[j];
                }
            }
        }

        return max;
    }
}
