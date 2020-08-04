package ru.geekbrains.kozirfm.popularlibrary;

import org.junit.Test;

import ru.geekbrains.kozirfm.popularlibrary.unit.Sum;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ExampleUnitTest {

    Sum sum = new Sum();

    @Test
    public void sum_isCorrect() {
        int a = 1;
        int b = 2;
        int result = sum.sum(a, b);

        assertEquals(result, 3);
    }

    @Test
    public void sum_isIncorrect() {
        int a = 1;
        int b = 2;
        int result = sum.sum(a, b);

        assertNotEquals(result, 4);
    }
}