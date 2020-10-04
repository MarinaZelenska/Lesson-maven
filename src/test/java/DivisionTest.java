import org.junit.AfterClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

public class DivisionTest {
    Division division = new Division();


    @Category(FastTests.class)
    @Test(timeout = 1000)
    public void test1div() {
        int expected = 1;
        assertEquals(division.div(3,3), expected);
    }


    @Test(expected = Exception.class)
    public void test2div() {
        int result = division.div(2,0);
    }

    @Test
    public void test3div() {
        int expected = 1;
        assertSame(division.div(3,3), expected);
    }

    @Test
    public void test4sum() {
       Boolean d = division.div(5,-1) < 0;
       assertTrue(String.valueOf(d), true);
    }

    @AfterClass
    public static void afterCl() {
        System.out.println("Annotation After Class");

    }

}