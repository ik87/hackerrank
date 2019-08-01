import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void whenEvenThenGetOne() {
       int result = Solution.pageCount(6, 2);
       assertThat(1, is(result));
    }

    @Test
    public void whenOddThenGetOne() {
        int result = Solution.pageCount(6, 5);
        assertThat(1, is(result));
    }

    @Test
    public void whenPutIntThenGetZero() {
        int result = Solution.pageCount(5, 4);
        assertThat(0, is(result));
    }



}