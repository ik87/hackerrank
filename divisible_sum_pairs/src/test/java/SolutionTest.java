import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void whenPutArrayThenGetThree() {
        int count = Solution.divisibleSumPairs(6, 5, new int[]{1, 2, 3, 4, 5, 6});
        assertThat(count, is(3));
    }

}