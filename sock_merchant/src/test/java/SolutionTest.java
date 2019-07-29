import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class SolutionTest {
    @Test
    public void whenPutArrayTheGetThree() {
        int result = Solution.sockMerchant(9, new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20});
        Assert.assertThat(3, is(result));
    }
}