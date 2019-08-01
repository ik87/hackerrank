/**
 * @author Kosolapov Ilya (d_dexter@mail.ru)
 * https://www.hackerrank.com/challenges/drawing-book/problem
 */
public class Solution {
    static int pageCount(int n, int p) {
        int countOne = p / 2;
        int countTwo;
        if (n - p == 1 && n % 2 == 0) {
            countTwo = 1;
        } else {
            countTwo = (n - p) / 2;
        }
        return countOne < countTwo ? countOne : countTwo;
    }
}
