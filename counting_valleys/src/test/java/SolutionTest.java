import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void whenPutTrackThenOne() {
        int result = Solution.countingValleys(8, "UDDDUDUU");
        assertThat(1, is(result));
    }

    @Test
    public void whenPutTrackThenTwo() {
        int result = Solution.countingValleys(12, "DDUUDDUDUUUD");
        assertThat(2, is(result));
    }

}