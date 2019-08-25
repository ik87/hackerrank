import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void whenTenThenGetNine() {
        int result = Solution.getMoneySpent(new int[]{3, 1}, new int[]{5, 2, 8}, 10);
        assertThat(result, is(9));
    }

    @Test
    public void whenFiveThenGetMinusOne() {
        int result = Solution.getMoneySpent(new int[]{4}, new int[]{5}, 5);
        assertThat(result, is(-1));
    }

    @Test
    public void whenSixtyThenGetFiftyEight() {
        int result = Solution.getMoneySpent(new int[]{40, 50, 60}, new int[]{5, 8, 12}, 60);
        assertThat(result, is(58));
    }
}