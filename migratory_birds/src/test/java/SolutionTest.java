import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void whenPutArrThenGetThree() {
        int num = Solution.migratoryBirds(Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4));
        Assert.assertThat(num, is(3));
    }

}