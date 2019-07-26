import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SolutionTest {
    private final ByteArrayOutputStream mem = new ByteArrayOutputStream();
    private final PrintStream out = System.out;

    @Before
    public void loadMem() {
        System.setOut(new PrintStream(this.mem));
    }

    @After
    public void loadSys() {
        System.setOut(new PrintStream(this.out));
    }

    @Test
    public void whenPutBillThenInt() {
        Solution.bonAppetit(Arrays.asList(3, 10, 2, 9), 1, 12);
        assertThat(mem.toString(), is("5"));
    }

    @Test
    public void whenPutBillThenBonAppetit() {
        Solution.bonAppetit(Arrays.asList(3, 10, 2, 9), 1, 7);
        assertThat(mem.toString(), is("Bon Appetit"));
    }

}