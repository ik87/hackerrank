/**
 * @author Kosolapov Ilya (d_dexter@mail.ru)
 * https://www.hackerrank.com/challenges/cats-and-a-mouse/problem
 */
public class Solution {
    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {
        int catA = Math.abs(z - x);
        int catB = Math.abs(z - y);
        return catA == catB ? "Mouse C" : catA < catB ? "Cat A" : "Cat B";

    }
}
