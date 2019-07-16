import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void whenAddArraysThenNine() {
        List<Integer> a = Arrays.asList(1);
        List<Integer> b = Arrays.asList(100);
        int count = Solution.getTotalX(a, b);
        assertThat(count, is(9));
    }

    @Test
    public void whenAddArraysThenThree() {
        List<Integer> a = Arrays.asList(2, 4);
        List<Integer> b = Arrays.asList(16, 32, 96);
        int count = Solution.getTotalX(a, b);
        assertThat(count, is(3));
    }

    @Test
    public void whenAddArraysThenZero() {
        List<Integer> a = Arrays.asList(100, 99, 98, 97, 96, 95, 94, 93, 92, 91);
        List<Integer> b = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int count = Solution.getTotalX(a, b);
        assertThat(count, is(0));
    }

    @Test
    public void whenAddArraysThenOne() {
        List<Integer> a = Arrays.asList(2);
        List<Integer> b = Arrays.asList(20, 30, 12);
        int count = Solution.getTotalX(a, b);
        assertThat(count, is(1));
    }

    @Test
    public void whenAddArraysThenEight() {
        List<Integer> a = Arrays.asList(1);
        List<Integer> b = Arrays.asList(72, 48);
        int count = Solution.getTotalX(a, b);
        assertThat(count, is(8));
    }
//1
//72 48
//2
//20 30 12
}