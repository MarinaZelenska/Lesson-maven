import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import java.awt.*;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;
import static org.junit.matchers.JUnitMatchers.hasItems;


@RunWith(Suite.class)
@Suite.SuiteClasses({CalculateTest.class})
public class ConcatinateTest {
    Concatinate first = new Concatinate();


    @BeforeClass
    public static void before(){
        System.out.println("Run tests");
    }



    @Category(FastTests.class)
    @Test(timeout = 1000)
    public void test1concat() {
        String exp = "onetwothree";
        assertEquals(first.concat("one", "two", "three"), exp);
    }

    @Test
    public void test2concat() {
        assertThat(first.concat("one", "two", "three"),containsString("three"));
    }

    @Test
    public void test3concat() {
        String second  = first.concat("one", "two", "three");
        assertTrue(String.valueOf(second.contains("two")), true);
    }


    @Test
    public void test4concat() {
        String second  = first.concat("one", "two", "three");
        assertFalse(String.valueOf(second.contains("four")), false);
    }

    @Test
    public void test5concat() {
        assertNotNull(first);
    }



    @AfterClass
    public static void after(){
        System.out.println("Tests finished");
    }



}