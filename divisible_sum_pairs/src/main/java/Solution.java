public class Solution {
    /**
     * @author Kosolapov Ilya (d_dexter@mail.ru)
     * https://www.hackerrank.com/challenges/divisible-sum-pairs/problem
     */
    static int divisibleSumPairs(int n, int k, int[] ar) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((ar[i] + ar[j]) % k == 0) {
                    count++;
                }
            }
        }
        return count;
    }

}
