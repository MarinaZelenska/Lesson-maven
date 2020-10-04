import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

public class SalaryTest {
    Salary pearson1 = new Salary();

    @Before
    public void testadd() {
        Salary pearson1 = new Salary(0, null);
        assertNull(pearson1.getCurrency());

    }


    @Test
    public void test7add() {
        assertNull(pearson1.getCurrency());
    }

    @Category(FastTests.class)
    @Test(timeout = 1000)
    public void test1add() {
        Salary pearson1 = new Salary(1000, "USD");
        Salary expected = new Salary(1000, "USD");
        assertEquals(String.valueOf(pearson1), String.valueOf(expected));
    }

    @Test
    public void tes2add() {
        Salary pearson1 = new Salary(500, "USD");
        Salary expected = new Salary(500, "USD");
        assertTrue(String.valueOf(pearson1.equals(expected)), true);
    }

    @Test(expected = Exception.class)
    public void test3add() {
        Salary pearson1 = new Salary(1000, "USD");
        Salary pearson2 = new Salary(0, "USD");
        int result = pearson1.getValue() / pearson2.getValue();

    }

    @Test
    public void tes4add() {
        Salary pearson1 = new Salary(500, "USD");
        assertTrue(String.valueOf(pearson1.getValue() > 100), true);
    }

    @Test
    public void tes5add() {
        Salary pearson1 = new Salary(500, "USD");
        assertFalse(String.valueOf(pearson1.getValue() < 100), false);
    }

    @After
    public void afterAnon() {
        System.out.println("Annotation After");

    }

    @AfterClass
    public static void afterCl() {
        System.out.println("Annotation After Class");

    }




}