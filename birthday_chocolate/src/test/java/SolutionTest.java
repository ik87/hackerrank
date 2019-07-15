import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void whenAddArrayThenGetTwo() {
        int count = Solution.birthday(Arrays.asList(1, 2, 1, 3, 2), 3, 2);
        assertThat(count, is(2));
    }

    @Test
    public void whenAddArrayThenGetZero() {
        int count = Solution.birthday(Arrays.asList(1, 1, 1, 1, 1, 1), 3, 2);
        assertThat(count, is(0));
    }

}