import java.util.List;
import java.util.stream.IntStream;

/**
 * @author Kosolapov Ilya (d_dexter@mail.ru)
 * https://www.hackerrank.com/challenges/bon-appetit/problem
 */
public class Solution {
    // Complete the bonAppetit function below.
    static void bonAppetit(List<Integer> bill, int k, int b) {
        int result = b - (IntStream.range(0, bill.size())
                .filter(x -> x != k).mapToObj(i -> bill.get(i)).reduce(0, (acc, x) -> acc + x) / 2);
        System.out.print(result == 0 ? "Bon Appetit" : result);
    }
}
