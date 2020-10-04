import org.hamcrest.core.CombinableMatcher;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;


public class CalculateTest {

    Calculate calculator = new Calculate();


    @BeforeClass
    public static void before(){
        System.out.println("Run tests");
    }


    @Test(timeout = 500)
    public void test1sum() {
        int expectedResult = 5;
        assertEquals(calculator.sum(3, 2), expectedResult);

    }

    @Test
    public void test2sum() {
        Integer i = 5;
        assertSame(calculator.sum(5, 0), i);

    }

    @Test
    public void test3sum() {
        Boolean d = calculator.sum(5, -1) < 10;
        System.out.println(d);
        assertTrue(String.valueOf(d), true);

    }

    @Test
    public void test4sum() {
        Boolean d = calculator.sum(5, -1) > 10;
        System.out.println(d);
        assertFalse(String.valueOf(d), false);

    }



    @Test
    public void test1multiply() {
        List<String> list = new ArrayList<String>();
        list.add(String.valueOf(calculator.multiply(2, 0)));
        list.add(String.valueOf(calculator.multiply(-2, 0)));
        list.add(String.valueOf(calculator.multiply(0, 0)));

        assertThat(list, everyItem(containsString("0")));


    }

    @Test
    public void test2multiply() {
        int expectedResult = 4;
        assertEquals(calculator.multiply(2, 2), expectedResult);

    }


    @Test
    public void test3multiply() {
        assertNull(String.valueOf(calculator.multiply(-2, 0)), null);

    }


}