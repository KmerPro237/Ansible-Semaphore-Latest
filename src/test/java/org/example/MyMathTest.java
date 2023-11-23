package org.example;

import org.example.MyMath;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyMathTest {

    @Test
    public void testSum() {
        MyMath workflow = new MyMath();

        assertEquals(5, workflow.sum(2, 3), "Sum should be 5");
        assertEquals(-8, workflow.sum(-5, -3), "Sum should be -8");
        assertEquals(0, workflow.sum(0, 0), "Sum should be 0");
    }

    @Test
    public void testMultiply() {
        MyMath workflow = new MyMath();

        assertEquals(12, workflow.multiply(4, 3), "Product should be 12");
        assertEquals(0, workflow.multiply(0, 100), "Product should be 0");
        assertEquals(-15, workflow.multiply(5, -3), "Product should be -15");
    }

    @Test
    public void testSortArray() {
        MyMath workflow = new MyMath();

        int[] inputArray = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        int[] sortedArray = workflow.sortArray(inputArray);

        int[] expectedSortedArray = {1, 1, 2, 3, 3, 4, 5, 5, 5, 6, 9};
        assertArrayEquals(expectedSortedArray, sortedArray, "Arrays should be equal");
    }

    @Test
    public void testIsPrime() {
        MyMath workflow = new MyMath();

        assertTrue(workflow.isPrime(2), "2 is a prime number");
        assertTrue(workflow.isPrime(13), "13 is a prime number");
        assertFalse(workflow.isPrime(6), "6 is not a prime number");
    }

    @Test
    public void testConcatenateStrings() {
        MyMath workflow = new MyMath();

        assertEquals("Hello World", workflow.concatenateStrings("Hello", "World"), "Strings should concatenate");
        assertThrows(IllegalArgumentException.class, () -> workflow.concatenateStrings(null, "World"),
                "IllegalArgumentException should be thrown for null input");
    }
}
