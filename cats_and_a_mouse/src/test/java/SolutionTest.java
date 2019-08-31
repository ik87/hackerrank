import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class SolutionTest {
    @Test
    public void whenPut123ThenGetCatB() {
        String result = Solution.catAndMouse(1, 2, 3);
        assertThat(result, is("Cat B"));
    }

    @Test
    public void whenPut132ThenGetCatC() {
        String result = Solution.catAndMouse(1, 3, 2);
        assertThat(result, is("Mouse C"));
    }
}