import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void whenPut1800ThenGetProperJulianCalendarDay() {
        String date = Solution.dayOfProgrammer(1800);
        Assert.assertThat(date, is("12.09.1800"));
    }

    @Test
    public void whenPut1917ThenGetProperJulianCalendarDay() {
        String date = Solution.dayOfProgrammer(1917);
        Assert.assertThat(date, is("13.09.1917"));
    }

    @Test
    public void whenPut2016ThenGetProperGregorianCalendarDay() {
        String date = Solution.dayOfProgrammer(2016);
        Assert.assertThat(date, is("12.09.2016"));
    }
}